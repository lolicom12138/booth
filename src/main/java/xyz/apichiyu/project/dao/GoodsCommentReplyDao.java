package xyz.apichiyu.project.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.apichiyu.project.entity.GoodsCommentReply;
import xyz.apichiyu.project.searchForm.GoodsCommentReplySearchForm;

@Mapper
public interface GoodsCommentReplyDao extends BaseDao<GoodsCommentReply, GoodsCommentReplySearchForm> {
}
