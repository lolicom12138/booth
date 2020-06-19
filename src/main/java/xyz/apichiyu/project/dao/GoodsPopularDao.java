package xyz.apichiyu.project.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.apichiyu.project.entity.GoodsPopular;
import xyz.apichiyu.project.searchForm.GoodsPopularSearchForm;

@Mapper
public interface GoodsPopularDao extends BaseDao<GoodsPopular, GoodsPopularSearchForm> {
}
