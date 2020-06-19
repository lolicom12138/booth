package xyz.apichiyu.project.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.apichiyu.project.entity.GoodsImg;
import xyz.apichiyu.project.searchForm.GoodsImgSearchForm;

@Mapper
public interface GoodsImgDao extends BaseDao<GoodsImg, GoodsImgSearchForm> {
}
