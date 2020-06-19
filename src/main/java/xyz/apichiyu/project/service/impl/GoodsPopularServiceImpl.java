package xyz.apichiyu.project.service.impl;

import org.springframework.stereotype.Service;
import xyz.apichiyu.project.entity.GoodsPopular;
import xyz.apichiyu.project.searchForm.GoodsPopularSearchForm;
import xyz.apichiyu.project.service.GoodsPopularService;

import java.util.List;
import java.util.Map;

@Service
public class GoodsPopularServiceImpl implements GoodsPopularService{

    @Override
    public boolean add(GoodsPopular object) {
        return false;
    }

    @Override
    public boolean addAll(List<GoodsPopular> list) {
        return false;
    }

    @Override
    public boolean delete(GoodsPopular object) {
        return false;
    }

    @Override
    public boolean deleteAll(List<GoodsPopular> list) {
        return false;
    }

    @Override
    public boolean deleteAll(GoodsPopularSearchForm form) {
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
    public boolean update(GoodsPopular object) {
        return false;
    }

    @Override
    public boolean updateAll(List<GoodsPopular> list) {
        return false;
    }

    @Override
    public boolean updateAll(GoodsPopular object, GoodsPopularSearchForm form) {
        return false;
    }

    @Override
    public boolean updateAll(GoodsPopular object, String searchMapJson) {
        return false;
    }

    @Override
    public boolean updateAll(GoodsPopular object, Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public GoodsPopular findById(String id) {
        return null;
    }

    @Override
    public GoodsPopular find(GoodsPopularSearchForm form) {
        return null;
    }

    @Override
    public GoodsPopular find(String searchMapJson) {
        return null;
    }

    @Override
    public GoodsPopular find(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public List<GoodsPopular> search(GoodsPopularSearchForm form) {
        return null;
    }

    @Override
    public List<GoodsPopular> search(String searchMapJson) {
        return null;
    }

    @Override
    public List<GoodsPopular> search(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public GoodsPopularSearchForm mapToForm(Map<String, Object> searchMap) {
        return null;
    }
}
