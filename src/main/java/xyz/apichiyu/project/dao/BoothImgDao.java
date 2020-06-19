package xyz.apichiyu.project.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.apichiyu.project.entity.BoothImg;
import xyz.apichiyu.project.searchForm.BoothImgSearchForm;

@Mapper
public interface BoothImgDao extends BaseDao<BoothImg, BoothImgSearchForm> {
}
