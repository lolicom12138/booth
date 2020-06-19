package xyz.apichiyu.project.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.apichiyu.project.entity.BoothCat;
import xyz.apichiyu.project.searchForm.BoothCatSearchForm;

@Mapper
public interface BoothCatDao extends BaseDao<BoothCat, BoothCatSearchForm> {
}
