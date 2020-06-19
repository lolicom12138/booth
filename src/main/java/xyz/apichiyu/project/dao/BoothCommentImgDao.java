package xyz.apichiyu.project.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.apichiyu.project.entity.BoothCommentImg;
import xyz.apichiyu.project.searchForm.BoothCommentImgSearchForm;

@Mapper
public interface BoothCommentImgDao extends BaseDao<BoothCommentImg, BoothCommentImgSearchForm> {
}
