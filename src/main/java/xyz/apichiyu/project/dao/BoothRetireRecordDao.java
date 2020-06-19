package xyz.apichiyu.project.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.apichiyu.project.entity.BoothRetireRecord;
import xyz.apichiyu.project.searchForm.BoothRetireRecordSearchForm;

@Mapper
public interface BoothRetireRecordDao extends BaseDao<BoothRetireRecord, BoothRetireRecordSearchForm> {
}
