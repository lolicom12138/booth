package xyz.apichiyu.project.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.apichiyu.project.entity.BoothAdmin;
import xyz.apichiyu.project.searchForm.BoothAdminSearchForm;

@Mapper
public interface BoothAdminDao extends BaseDao<BoothAdmin, BoothAdminSearchForm> {
}
