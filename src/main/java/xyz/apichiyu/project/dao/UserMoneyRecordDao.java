package xyz.apichiyu.project.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.apichiyu.project.entity.UserMoneyRecord;
import xyz.apichiyu.project.searchForm.UserMoneyRecordSearchForm;

@Mapper
public interface UserMoneyRecordDao extends BaseDao<UserMoneyRecord, UserMoneyRecordSearchForm> {
}
