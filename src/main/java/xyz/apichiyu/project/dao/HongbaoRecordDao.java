package xyz.apichiyu.project.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.apichiyu.project.entity.HongbaoRecord;
import xyz.apichiyu.project.searchForm.HongbaoRecordSearchForm;

@Mapper
public interface HongbaoRecordDao extends BaseDao<HongbaoRecord, HongbaoRecordSearchForm> {
}
