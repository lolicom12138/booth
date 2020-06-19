package xyz.apichiyu.project.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.apichiyu.project.entity.BoothUsualLocation;
import xyz.apichiyu.project.searchForm.BoothUsualLocationSearchForm;

@Mapper
public interface BoothUsualLocationDao extends BaseDao<BoothUsualLocation, BoothUsualLocationSearchForm> {
}
