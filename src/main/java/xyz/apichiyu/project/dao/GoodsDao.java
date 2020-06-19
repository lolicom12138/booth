package xyz.apichiyu.project.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.apichiyu.project.entity.Goods;
import xyz.apichiyu.project.searchForm.GoodsSearchForm;

@Mapper
public interface GoodsDao extends BaseDao<Goods, GoodsSearchForm> {
}
