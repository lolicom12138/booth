package xyz.apichiyu.project.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.apichiyu.project.entity.BoothAdminActionRecord;
import xyz.apichiyu.project.searchForm.BoothAdminActionRecordSearchForm;

@Mapper
public interface BoothAdminActionRecordDao extends BaseDao<BoothAdminActionRecord, BoothAdminActionRecordSearchForm> {
}
