package xyz.apichiyu.project.service.impl;

import org.springframework.stereotype.Service;
import xyz.apichiyu.project.entity.GoodsTag;
import xyz.apichiyu.project.searchForm.GoodsTagSearchForm;
import xyz.apichiyu.project.service.GoodsTagService;

import java.util.List;
import java.util.Map;

@Service
public class GoodsTagServiceImpl implements GoodsTagService{

    @Override
    public boolean add(GoodsTag object) {
        return false;
    }

    @Override
    public boolean addAll(List<GoodsTag> list) {
        return false;
    }

    @Override
    public boolean delete(GoodsTag object) {
        return false;
    }

    @Override
    public boolean deleteAll(List<GoodsTag> list) {
        return false;
    }

    @Override
    public boolean deleteAll(GoodsTagSearchForm form) {
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
    public boolean update(GoodsTag object) {
        return false;
    }

    @Override
    public boolean updateAll(List<GoodsTag> list) {
        return false;
    }

    @Override
    public boolean updateAll(GoodsTag object, GoodsTagSearchForm form) {
        return false;
    }

    @Override
    public boolean updateAll(GoodsTag object, String searchMapJson) {
        return false;
    }

    @Override
    public boolean updateAll(GoodsTag object, Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public GoodsTag findById(String id) {
        return null;
    }

    @Override
    public GoodsTag find(GoodsTagSearchForm form) {
        return null;
    }

    @Override
    public GoodsTag find(String searchMapJson) {
        return null;
    }

    @Override
    public GoodsTag find(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public List<GoodsTag> search(GoodsTagSearchForm form) {
        return null;
    }

    @Override
    public List<GoodsTag> search(String searchMapJson) {
        return null;
    }

    @Override
    public List<GoodsTag> search(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public GoodsTagSearchForm mapToForm(Map<String, Object> searchMap) {
        return null;
    }
}
