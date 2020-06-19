package xyz.apichiyu.project.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.apichiyu.project.entity.UserSearch;
import xyz.apichiyu.project.searchForm.UserSearchSearchForm;

@Mapper
public interface UserSearchDao extends BaseDao<UserSearch, UserSearchSearchForm> {
}
