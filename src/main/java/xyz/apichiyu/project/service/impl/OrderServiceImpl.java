package xyz.apichiyu.project.service.impl;

import org.springframework.stereotype.Service;
import xyz.apichiyu.project.entity.Order;
import xyz.apichiyu.project.searchForm.OrderSearchForm;
import xyz.apichiyu.project.service.OrderService;

import java.util.List;
import java.util.Map;

@Service
public class OrderServiceImpl implements OrderService{

    @Override
    public boolean add(Order object) {
        return false;
    }

    @Override
    public boolean addAll(List<Order> list) {
        return false;
    }

    @Override
    public boolean delete(Order object) {
        return false;
    }

    @Override
    public boolean deleteAll(List<Order> list) {
        return false;
    }

    @Override
    public boolean deleteAll(OrderSearchForm form) {
        return false;
    }

    @Override
    public boolean deleteAll(String searchMapJson) {
        return false;
    }

    @Override
    public boolean deleteAll(Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public boolean update(Order object) {
        return false;
    }

    @Override
    public boolean updateAll(List<Order> list) {
        return false;
    }

    @Override
    public boolean updateAll(Order object, OrderSearchForm form) {
        return false;
    }

    @Override
    public boolean updateAll(Order object, String searchMapJson) {
        return false;
    }

    @Override
    public boolean updateAll(Order object, Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public Order findById(String id) {
        return null;
    }

    @Override
    public Order find(OrderSearchForm form) {
        return null;
    }

    @Override
    public Order find(String searchMapJson) {
        return null;
    }

    @Override
    public Order find(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public List<Order> search(OrderSearchForm form) {
        return null;
    }

    @Override
    public List<Order> search(String searchMapJson) {
        return null;
    }

    @Override
    public List<Order> search(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public OrderSearchForm mapToForm(Map<String, Object> searchMap) {
        return null;
    }
}
