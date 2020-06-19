package xyz.apichiyu.project.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.apichiyu.project.entity.Admin;
import xyz.apichiyu.project.searchForm.AdminSearchForm;

@Mapper
public interface AdminDao extends BaseDao<Admin, AdminSearchForm> {
}
