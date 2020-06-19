package xyz.apichiyu.project.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.apichiyu.project.entity.City;
import xyz.apichiyu.project.searchForm.CitySearchForm;

@Mapper
public interface CityDao extends BaseDao<City, CitySearchForm> {
}
