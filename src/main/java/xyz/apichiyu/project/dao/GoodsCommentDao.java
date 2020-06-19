package xyz.apichiyu.project.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.apichiyu.project.entity.GoodsComment;
import xyz.apichiyu.project.searchForm.GoodsCommentSearchForm;

@Mapper
public interface GoodsCommentDao extends BaseDao<GoodsComment, GoodsCommentSearchForm> {
}
