package xyz.apichiyu.project.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.apichiyu.project.entity.UserRetireRecord;
import xyz.apichiyu.project.searchForm.UserRetireRecordSearchForm;

@Mapper
public interface UserRetireRecordDao extends BaseDao<UserRetireRecord, UserRetireRecordSearchForm> {
}
