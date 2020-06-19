package xyz.apichiyu.project.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.apichiyu.project.entity.BoothGoodsCat;
import xyz.apichiyu.project.searchForm.BoothGoodsCatSearchForm;

@Mapper
public interface BoothGoodsCatDao extends BaseDao<BoothGoodsCat, BoothGoodsCatSearchForm> {
}
