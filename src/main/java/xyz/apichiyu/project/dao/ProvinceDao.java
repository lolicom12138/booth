package xyz.apichiyu.project.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.apichiyu.project.entity.Province;
import xyz.apichiyu.project.searchForm.ProvinceSearchForm;

@Mapper
public interface ProvinceDao extends BaseDao<Province, ProvinceSearchForm> {
}
