package xyz.apichiyu.project.service;

import xyz.apichiyu.project.entity.Setting;
import xyz.apichiyu.project.searchForm.SettingSearchForm;

public interface SettingService extends BaseService<Setting, SettingSearchForm> {
    public Setting findByKey(String key);
}
