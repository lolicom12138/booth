package xyz.apichiyu.project.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import xyz.apichiyu.project.dao.SettingDao;
import xyz.apichiyu.project.entity.Setting;
import xyz.apichiyu.project.enums.SettingValueType;
import xyz.apichiyu.project.searchForm.SettingSearchForm;
import xyz.apichiyu.project.service.SettingService;
import xyz.apichiyu.project.util.JsonUtil;
import xyz.apichiyu.project.util.StringUtil;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Service
public class SettingServiceImpl implements SettingService {
    private Logger logger = Logger.getLogger(SettingServiceImpl.class);
    private SettingDao settingDao;
    @Autowired
    public SettingServiceImpl(SettingDao settingDao){
        this.settingDao = settingDao;
    }
    @Override
    public Setting findByKey(String key) {
        SettingSearchForm form = new SettingSearchForm();
        form.setKey(key);
        return this.find(form);
    }

    @Override
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRES_NEW)
    public boolean add(Setting object) {
        object.setId(StringUtil.makeId(8));
        try {
            if (settingDao.add(object) == 1) {
                return true;
            }
            throw new Exception("line num error");
        } catch (Exception e) {
            e.printStackTrace();
            logger.debug(e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }
        return false;
    }

    @Override
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRES_NEW)
    public boolean addAll(List<Setting> list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).setId(StringUtil.makeId(8));
        }
        try {
            if (settingDao.addAll(list) == list.size()) {
                return true;
            }
            throw new Exception("line num error");
        } catch (Exception e) {
            logger.debug(e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }
        return false;
    }

    @Override
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRES_NEW)
    public boolean delete(Setting object) {
        try {
            if (settingDao.delete(object) == 1) {
                return true;
            } else {
                throw new Exception("line num error");
            }
        } catch (Exception e) {
            logger.debug(e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }
        return false;
    }

    @Override
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRES_NEW)
    public boolean deleteAll(List<Setting> list) {
        try {
            Iterator<Setting> ite = list.iterator();
            while (ite.hasNext()) {
                Setting fileStorage = ite.next();
                if (settingDao.delete(fileStorage) == 1) {
                    continue;
                } else {
                    throw new Exception("line num error");
                }
            }
            return true;
        } catch (Exception e) {
            logger.debug(e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }
        return false;
    }

    @Override
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRES_NEW)
    public boolean deleteAll(SettingSearchForm form) {
        try {
            return settingDao.deleteAll(form) > 0;
        } catch (Exception e) {
            logger.debug(e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }
        return false;
    }

    @Override
    public boolean deleteAll(String searchMapJson) {
        Map<String, Object> searchMap = JsonUtil.toObject(HashMap.class, searchMapJson);
        if (null != searchMap) {
            return this.deleteAll(searchMap);
        }
        return false;
    }

    @Override
    public boolean deleteAll(Map<String, Object> searchMap) {
        SettingSearchForm form = this.mapToForm(searchMap);
        if (null != form) {
            return this.deleteAll(form);
        }
        return false;
    }

    @Override
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRES_NEW)
    public boolean update(Setting object) {
        try {
            if (settingDao.update(object) == 1) {
                return true;
            } else {
                throw new Exception("line num error");
            }
        } catch (Exception e) {
            logger.debug(e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }
        return false;
    }

    @Override
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRES_NEW)
    public boolean updateAll(List<Setting> list) {
        try {
            Iterator<Setting> ite = list.iterator();
            while (ite.hasNext()) {
                if (settingDao.update(ite.next()) == 1) {
                    continue;
                }
                throw new Exception("line num error");
            }
        } catch (Exception e) {
            logger.debug(e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }
        return false;
    }

    @Override
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRES_NEW)
    public boolean updateAll(Setting object, SettingSearchForm form) {
        try {
            return settingDao.updateAll(object, form) > 0;
        } catch (Exception e) {
            logger.debug(e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }
        return false;
    }

    @Override
    public boolean updateAll(Setting object, String searchMapJson) {
        Map<String, Object> searchMap = JsonUtil.toObject(HashMap.class, searchMapJson);
        if (null != searchMap) {
            return this.updateAll(object, searchMap);
        }
        return false;
    }

    @Override
    public boolean updateAll(Setting object, Map<String, Object> searchMap) {
        SettingSearchForm form = this.mapToForm(searchMap);
        if (null != form) {
            return this.updateAll(object, form);
        }
        return false;
    }

    @Override
    public Setting findById(String id) {
        try {
            return settingDao.findById(id);
        } catch (Exception e) {
            logger.debug(e);
            return null;
        }
    }

    @Override
    public Setting find(SettingSearchForm form) {
        try {
            return settingDao.findByForm(form);
        } catch (Exception e) {
            logger.debug(e);
            return null;
        }
    }

    @Override
    public Setting find(String searchMapJson) {
        Map<String, Object> searchMap = JsonUtil.toObject(HashMap.class, searchMapJson);
        if (null != searchMap) {
            return this.find(searchMap);
        }
        return null;
    }

    @Override
    public Setting find(Map<String, Object> searchMap) {
        SettingSearchForm form = this.mapToForm(searchMap);
        if (null != form) {
            return this.find(form);
        }
        return null;
    }

    @Override
    public List<Setting> search(SettingSearchForm form) {
        try {
            return settingDao.searchByForm(form);
        } catch (Exception e) {
            logger.debug(e);
            return null;
        }
    }

    @Override
    public List<Setting> search(String searchMapJson) {
        Map<String, Object> searchMap = JsonUtil.toObject(HashMap.class, searchMapJson);
        if (null != searchMap) {
            return this.search(searchMap);
        }
        return null;
    }

    @Override
    public List<Setting> search(Map<String, Object> searchMap) {
        SettingSearchForm form = this.mapToForm(searchMap);
        if (null != form) {
            return this.search(form);
        }
        return null;
    }

    @Override
    public SettingSearchForm mapToForm(Map<String, Object> searchMap) {
        SettingSearchForm form = new SettingSearchForm();
        try {
            if (searchMap.containsKey("key")) {
                form.setKey((String) searchMap.get("key"));
            }
            if (searchMap.containsKey("value")) {
                form.setValue((String) searchMap.get("value"));
            }
            if (searchMap.containsKey("type")) {
                form.setType((SettingValueType) searchMap.get("type"));
            }
            if (searchMap.containsKey("id")) {
                form.setId((String) searchMap.get("id"));
            }
            if (searchMap.containsKey("page")) {
                form.setPage(Integer.parseInt((String) searchMap.get("page")));
            }
            if (searchMap.containsKey("pageRows")) {
                form.setPageRows(Integer.parseInt((String) searchMap.get("pageRows")));
            }
            if (searchMap.containsKey("sortBy")) {
                form.setSortBy((String) searchMap.get("sortBy"));
            }
            if (searchMap.containsKey("sortType")) {
                form.setSortType((String) searchMap.get("sortType"));
            }
            if (searchMap.containsKey("fuzzy")) {
                form.setFuzzy((Boolean) searchMap.get("fuzzy"));
            }
            return form;
        } catch (Exception e) {
            logger.debug(e);
            return null;
        }
    }
}
