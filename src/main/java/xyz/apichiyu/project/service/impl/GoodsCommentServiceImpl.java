package xyz.apichiyu.project.service.impl;

import org.springframework.stereotype.Service;
import xyz.apichiyu.project.entity.GoodsComment;
import xyz.apichiyu.project.searchForm.GoodsCommentSearchForm;
import xyz.apichiyu.project.service.GoodsCommentService;

import java.util.List;
import java.util.Map;

@Service
public class GoodsCommentServiceImpl implements GoodsCommentService{

    @Override
    public boolean add(GoodsComment object) {
        return false;
    }

    @Override
    public boolean addAll(List<GoodsComment> list) {
        return false;
    }

    @Override
    public boolean delete(GoodsComment object) {
        return false;
    }

    @Override
    public boolean deleteAll(List<GoodsComment> list) {
        return false;
    }

    @Override
    public boolean deleteAll(GoodsCommentSearchForm form) {
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
    public boolean update(GoodsComment object) {
        return false;
    }

    @Override
    public boolean updateAll(List<GoodsComment> list) {
        return false;
    }

    @Override
    public boolean updateAll(GoodsComment object, GoodsCommentSearchForm form) {
        return false;
    }

    @Override
    public boolean updateAll(GoodsComment object, String searchMapJson) {
        return false;
    }

    @Override
    public boolean updateAll(GoodsComment object, Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public GoodsComment findById(String id) {
        return null;
    }

    @Override
    public GoodsComment find(GoodsCommentSearchForm form) {
        return null;
    }

    @Override
    public GoodsComment find(String searchMapJson) {
        return null;
    }

    @Override
    public GoodsComment find(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public List<GoodsComment> search(GoodsCommentSearchForm form) {
        return null;
    }

    @Override
    public List<GoodsComment> search(String searchMapJson) {
        return null;
    }

    @Override
    public List<GoodsComment> search(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public GoodsCommentSearchForm mapToForm(Map<String, Object> searchMap) {
        return null;
    }
}
