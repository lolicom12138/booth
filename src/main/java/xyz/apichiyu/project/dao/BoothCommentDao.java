package xyz.apichiyu.project.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.apichiyu.project.entity.BoothComment;
import xyz.apichiyu.project.searchForm.BoothCommentSearchForm;

@Mapper
public interface BoothCommentDao extends BaseDao<BoothComment, BoothCommentSearchForm> {
}
