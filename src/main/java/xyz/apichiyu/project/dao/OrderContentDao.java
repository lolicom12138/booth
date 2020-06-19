package xyz.apichiyu.project.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.apichiyu.project.entity.OrderContent;
import xyz.apichiyu.project.searchForm.OrderContentSearchForm;

@Mapper
public interface OrderContentDao extends BaseDao<OrderContent, OrderContentSearchForm> {
}
