package xyz.apichiyu.project.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.apichiyu.project.entity.BoothViewRecord;
import xyz.apichiyu.project.searchForm.BoothViewRecordSearchForm;

@Mapper
public interface BoothViewRecordDao extends BaseDao<BoothViewRecord, BoothViewRecordSearchForm> {
}
