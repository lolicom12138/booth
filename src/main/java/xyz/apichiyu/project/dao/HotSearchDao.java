package xyz.apichiyu.project.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.apichiyu.project.entity.HotSearch;
import xyz.apichiyu.project.searchForm.HotSearchSearchForm;

@Mapper
public interface HotSearchDao extends BaseDao<HotSearch, HotSearchSearchForm> {
}
