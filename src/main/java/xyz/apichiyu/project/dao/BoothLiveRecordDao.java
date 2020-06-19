package xyz.apichiyu.project.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.apichiyu.project.entity.BoothLiveRecord;
import xyz.apichiyu.project.searchForm.BoothLiveRecordSearchForm;

@Mapper
public interface BoothLiveRecordDao extends BaseDao<BoothLiveRecord, BoothLiveRecordSearchForm> {
}
