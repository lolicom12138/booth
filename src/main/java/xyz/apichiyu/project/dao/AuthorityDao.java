package xyz.apichiyu.project.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.apichiyu.project.entity.Authority;
import xyz.apichiyu.project.searchForm.AuthoritySearchForm;

@Mapper
public interface AuthorityDao extends BaseDao<Authority, AuthoritySearchForm> {
}
