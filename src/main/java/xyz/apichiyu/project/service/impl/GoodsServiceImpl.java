package xyz.apichiyu.project.service.impl;

import org.springframework.stereotype.Service;
import xyz.apichiyu.project.entity.Goods;
import xyz.apichiyu.project.searchForm.GoodsSearchForm;
import xyz.apichiyu.project.service.GoodsService;

import java.util.List;
import java.util.Map;

@Service
public class GoodsServiceImpl implements GoodsService{

    @Override
    public boolean add(Goods object) {
        return false;
    }

    @Override
    public boolean addAll(List<Goods> list) {
        return false;
    }

    @Override
    public boolean delete(Goods object) {
        return false;
    }

    @Override
    public boolean deleteAll(List<Goods> list) {
        return false;
    }

    @Override
    public boolean deleteAll(GoodsSearchForm form) {
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
    public boolean update(Goods object) {
        return false;
    }

    @Override
    public boolean updateAll(List<Goods> list) {
        return false;
    }

    @Override
    public boolean updateAll(Goods object, GoodsSearchForm form) {
        return false;
    }

    @Override
    public boolean updateAll(Goods object, String searchMapJson) {
        return false;
    }

    @Override
    public boolean updateAll(Goods object, Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public Goods findById(String id) {
        return null;
    }

    @Override
    public Goods find(GoodsSearchForm form) {
        return null;
    }

    @Override
    public Goods find(String searchMapJson) {
        return null;
    }

    @Override
    public Goods find(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public List<Goods> search(GoodsSearchForm form) {
        return null;
    }

    @Override
    public List<Goods> search(String searchMapJson) {
        return null;
    }

    @Override
    public List<Goods> search(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public GoodsSearchForm mapToForm(Map<String, Object> searchMap) {
        return null;
    }
}
