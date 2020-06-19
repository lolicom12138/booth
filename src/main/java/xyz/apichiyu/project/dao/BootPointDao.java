package xyz.apichiyu.project.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.apichiyu.project.entity.BoothPoint;
import xyz.apichiyu.project.searchForm.BoothPointSearchForm;

@Mapper
public interface BootPointDao extends BaseDao<BoothPoint, BoothPointSearchForm> {
}
