package xyz.apichiyu.project.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.apichiyu.project.entity.GoodsTag;
import xyz.apichiyu.project.searchForm.GoodsTagSearchForm;

@Mapper
public interface GoodsTagDao extends BaseDao<GoodsTag, GoodsTagSearchForm> {
}
