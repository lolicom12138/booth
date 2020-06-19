package xyz.apichiyu.project.service.impl;

import org.springframework.stereotype.Service;
import xyz.apichiyu.project.entity.OrderContent;
import xyz.apichiyu.project.searchForm.OrderContentSearchForm;
import xyz.apichiyu.project.service.OrderContentService;

import java.util.List;
import java.util.Map;

@Service
public class OrderContentServiceImpl implements OrderContentService{

    @Override
    public boolean add(OrderContent object) {
        return false;
    }

    @Override
    public boolean addAll(List<OrderContent> list) {
        return false;
    }

    @Override
    public boolean delete(OrderContent object) {
        return false;
    }

    @Override
    public boolean deleteAll(List<OrderContent> list) {
        return false;
    }

    @Override
    public boolean deleteAll(OrderContentSearchForm form) {
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
    public boolean update(OrderContent object) {
        return false;
    }

    @Override
    public boolean updateAll(List<OrderContent> list) {
        return false;
    }

    @Override
    public boolean updateAll(OrderContent object, OrderContentSearchForm form) {
        return false;
    }

    @Override
    public boolean updateAll(OrderContent object, String searchMapJson) {
        return false;
    }

    @Override
    public boolean updateAll(OrderContent object, Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public OrderContent findById(String id) {
        return null;
    }

    @Override
    public OrderContent find(OrderContentSearchForm form) {
        return null;
    }

    @Override
    public OrderContent find(String searchMapJson) {
        return null;
    }

    @Override
    public OrderContent find(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public List<OrderContent> search(OrderContentSearchForm form) {
        return null;
    }

    @Override
    public List<OrderContent> search(String searchMapJson) {
        return null;
    }

    @Override
    public List<OrderContent> search(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public OrderContentSearchForm mapToForm(Map<String, Object> searchMap) {
        return null;
    }
}
