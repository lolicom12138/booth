package xyz.apichiyu.project.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.apichiyu.project.entity.BoothAdminAuthority;
import xyz.apichiyu.project.searchForm.BoothAdminAuthoritySearchForm;

@Mapper
public interface BoothAdminAuthorityDao extends BaseDao<BoothAdminAuthority, BoothAdminAuthoritySearchForm> {
}
