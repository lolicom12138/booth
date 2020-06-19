package xyz.apichiyu.project.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.apichiyu.project.entity.Hongbao;
import xyz.apichiyu.project.searchForm.HongbaoSearchForm;

@Mapper
public interface HongbaoDao extends BaseDao<Hongbao, HongbaoSearchForm> {
}
