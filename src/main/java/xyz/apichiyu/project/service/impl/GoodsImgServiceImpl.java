package xyz.apichiyu.project.service.impl;

import org.springframework.stereotype.Service;
import xyz.apichiyu.project.entity.GoodsImg;
import xyz.apichiyu.project.searchForm.GoodsImgSearchForm;
import xyz.apichiyu.project.service.GoodsImgService;

import java.util.List;
import java.util.Map;

@Service
public class GoodsImgServiceImpl implements GoodsImgService{

    @Override
    public boolean add(GoodsImg object) {
        return false;
    }

    @Override
    public boolean addAll(List<GoodsImg> list) {
        return false;
    }

    @Override
    public boolean delete(GoodsImg object) {
        return false;
    }

    @Override
    public boolean deleteAll(List<GoodsImg> list) {
        return false;
    }

    @Override
    public boolean deleteAll(GoodsImgSearchForm form) {
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
    public boolean update(GoodsImg object) {
        return false;
    }

    @Override
    public boolean updateAll(List<GoodsImg> list) {
        return false;
    }

    @Override
    public boolean updateAll(GoodsImg object, GoodsImgSearchForm form) {
        return false;
    }

    @Override
    public boolean updateAll(GoodsImg object, String searchMapJson) {
        return false;
    }

    @Override
    public boolean updateAll(GoodsImg object, Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public GoodsImg findById(String id) {
        return null;
    }

    @Override
    public GoodsImg find(GoodsImgSearchForm form) {
        return null;
    }

    @Override
    public GoodsImg find(String searchMapJson) {
        return null;
    }

    @Override
    public GoodsImg find(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public List<GoodsImg> search(GoodsImgSearchForm form) {
        return null;
    }

    @Override
    public List<GoodsImg> search(String searchMapJson) {
        return null;
    }

    @Override
    public List<GoodsImg> search(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public GoodsImgSearchForm mapToForm(Map<String, Object> searchMap) {
        return null;
    }
}
