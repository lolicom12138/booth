package xyz.apichiyu.project.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.apichiyu.project.entity.BoothPopular;
import xyz.apichiyu.project.searchForm.BoothPopularSearchForm;

@Mapper
public interface BoothPopularDao extends BaseDao<BoothPopular, BoothPopularSearchForm> {
}
