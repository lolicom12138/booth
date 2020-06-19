package xyz.apichiyu.project.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.apichiyu.project.entity.GoodsCommentImg;
import xyz.apichiyu.project.searchForm.GoodsCommentImgSearchForm;

@Mapper
public interface GoodsCommentImgDao extends BaseDao<GoodsCommentImg, GoodsCommentImgSearchForm> {
}
