package xyz.apichiyu.project.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.apichiyu.project.entity.Order;
import xyz.apichiyu.project.searchForm.OrderSearchForm;

@Mapper
public interface OrderDao extends BaseDao<Order, OrderSearchForm> {
}
