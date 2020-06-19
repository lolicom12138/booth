package xyz.apichiyu.project.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.apichiyu.project.entity.Setting;
import xyz.apichiyu.project.searchForm.SettingSearchForm;

@Mapper
public interface SettingDao extends BaseDao<Setting, SettingSearchForm> {
}
