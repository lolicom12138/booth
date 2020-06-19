package xyz.apichiyu.project.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.apichiyu.project.entity.Booth;
import xyz.apichiyu.project.searchForm.BoothSearchForm;

@Mapper
public interface BoothDao extends BaseDao<Booth, BoothSearchForm> {
}
