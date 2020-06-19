package xyz.apichiyu.project.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.apichiyu.project.entity.UserTelCode;
import xyz.apichiyu.project.searchForm.UserTelCodeSearchForm;

@Mapper
public interface UserTelCodeDao extends BaseDao<UserTelCode, UserTelCodeSearchForm> {
}
