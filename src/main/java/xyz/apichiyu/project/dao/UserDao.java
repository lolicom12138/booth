package xyz.apichiyu.project.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.apichiyu.project.entity.User;
import xyz.apichiyu.project.searchForm.UserSearchForm;

@Mapper
public interface UserDao extends BaseDao<User, UserSearchForm> {
}
