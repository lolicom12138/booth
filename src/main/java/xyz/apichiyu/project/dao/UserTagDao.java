package xyz.apichiyu.project.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.apichiyu.project.entity.UserTag;
import xyz.apichiyu.project.searchForm.UserTagSearchForm;

@Mapper
public interface UserTagDao extends BaseDao<UserTag, UserTagSearchForm> {
}
