package xyz.apichiyu.project.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.apichiyu.project.entity.GoodsViewRecord;
import xyz.apichiyu.project.searchForm.GoodsViewRecordSearchForm;

@Mapper
public interface GoodsViewRecordDao extends BaseDao<GoodsViewRecord, GoodsViewRecordSearchForm> {
}
