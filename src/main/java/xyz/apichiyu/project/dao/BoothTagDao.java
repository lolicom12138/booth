package xyz.apichiyu.project.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.apichiyu.project.entity.BoothTag;
import xyz.apichiyu.project.searchForm.BoothTagSearchForm;

@Mapper
public interface BoothTagDao extends BaseDao<BoothTag, BoothTagSearchForm> {
}
