package xyz.apichiyu.project.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.apichiyu.project.entity.AdminAuthority;
import xyz.apichiyu.project.searchForm.AdminAuthoritySearchForm;

@Mapper
public interface AdminAuthorityDao extends BaseDao<AdminAuthority, AdminAuthoritySearchForm> {
}
