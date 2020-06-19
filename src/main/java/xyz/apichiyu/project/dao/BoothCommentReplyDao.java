package xyz.apichiyu.project.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.apichiyu.project.entity.BoothCommentReply;
import xyz.apichiyu.project.searchForm.BoothCommentReplySearchForm;

@Mapper
public interface BoothCommentReplyDao extends BaseDao<BoothCommentReply, BoothCommentReplySearchForm> {
}
