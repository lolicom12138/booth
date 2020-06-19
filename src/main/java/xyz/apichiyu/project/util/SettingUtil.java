package xyz.apichiyu.project.util;

import xyz.apichiyu.project.entity.Setting;
import xyz.apichiyu.project.enums.SettingValueType;
import xyz.apichiyu.project.service.SettingService;
import xyz.apichiyu.project.service.impl.SettingServiceImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * the util class which controls the settings
 */
public class SettingUtil {
    // the setting rest in cache for 2 hours
    private static final long expireIn = 7200000;
    // the cache of the settings
    private static Map<String,Map<String,Object>> settings;

    /**
     * find a setting by key
     * @param key
     * @return
     */
    private static Object getSetting(String key){
        try{
            if(settings.containsKey(key)){
                return checkAndUpdate(key);
            }else{
                return update(key);
            }
        }catch(Exception e){

        }
        return update(key);
    }

    /**
     * setting in cache, check its status
     * if not expire,return
     * if expire, update and return
     * @param key
     * @return
     */
    private static Object checkAndUpdate(String key){
        Map<String,Object> result = settings.get(key);
        try{
            Object output = result.get("value");
            long timeExpire = (long) result.get("timeExpire");
            if(timeExpire > System.currentTimeMillis()){
                return output;
            }
        }catch(Exception e){}
        return update(key);
    }

    /**
     * find setting in db and update the cache
     * @param key
     * @return
     */
    private synchronized static Object update(String key){
        SettingService settingService = SpringUtil.getBean(SettingServiceImpl.class);
        Setting setting = settingService.findByKey(key);
        Object output = null;
        if(null == setting){
            return null;
        }
        Map<String,Object> result = new ConcurrentHashMap<>();
        switch(setting.getType()){
            case JSON:
                output = JsonUtil.toObject(HashMap.class,setting.getValue());
                break;
            default:
                output = setting.getValue();
                break;
        }
        result.put("value",output);
        result.put("timeExpire",System.currentTimeMillis()+expireIn);
        if(null == settings){
            settings = new ConcurrentHashMap<>();
        }
        settings.put(key,result);
        return output;
    }

    /**
     * set the setting in db and update the cache
     * @param key
     * @param value
     */
    public static synchronized void setSettings(String key,Object value){
        SettingService settingService = SpringUtil.getBean(SettingServiceImpl.class);
        Setting setting = new Setting();
        setting.setId(StringUtil.makeId(8));
        if(value instanceof String){
            setting.setValue((String) value);
            setting.setType(SettingValueType.STRING);
        }else{
            setting.setValue(JsonUtil.toJson(value));
            setting.setType(SettingValueType.JSON);
        }
        if(!settingService.update(setting)){
            settingService.add(setting);
        }
        if(null == settings){
            settings = new ConcurrentHashMap<>();
        }
        Map<String,Object> result = new HashMap<>();
        result.put("value",value);
        result.put("timeExpire",System.currentTimeMillis()+expireIn);
        settings.put(key,result);
    }
}
