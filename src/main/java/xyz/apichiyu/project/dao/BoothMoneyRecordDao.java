package xyz.apichiyu.project.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.apichiyu.project.entity.BoothMoneyRecord;
import xyz.apichiyu.project.searchForm.BoothMoneyRecordSearchForm;

@Mapper
public interface BoothMoneyRecordDao extends BaseDao<BoothMoneyRecord, BoothMoneyRecordSearchForm> {
}
