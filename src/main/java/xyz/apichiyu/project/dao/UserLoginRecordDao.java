package xyz.apichiyu.project.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.apichiyu.project.entity.UserLoginRecord;
import xyz.apichiyu.project.searchForm.UserLoginRecordSearchForm;

@Mapper
public interface UserLoginRecordDao extends BaseDao<UserLoginRecord, UserLoginRecordSearchForm> {
}
