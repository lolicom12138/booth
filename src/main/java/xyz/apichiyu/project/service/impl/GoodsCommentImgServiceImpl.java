package xyz.apichiyu.project.service.impl;

import org.springframework.stereotype.Service;
import xyz.apichiyu.project.entity.GoodsCommentImg;
import xyz.apichiyu.project.searchForm.GoodsCommentImgSearchForm;
import xyz.apichiyu.project.service.GoodsCommentImgService;

import java.util.List;
import java.util.Map;

@Service
public class GoodsCommentImgServiceImpl implements GoodsCommentImgService{

    @Override
    public boolean add(GoodsCommentImg object) {
        return false;
    }

    @Override
    public boolean addAll(List<GoodsCommentImg> list) {
        return false;
    }

    @Override
    public boolean delete(GoodsCommentImg object) {
        return false;
    }

    @Override
    public boolean deleteAll(List<GoodsCommentImg> list) {
        return false;
    }

    @Override
    public boolean deleteAll(GoodsCommentImgSearchForm form) {
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
    public boolean update(GoodsCommentImg object) {
        return false;
    }

    @Override
    public boolean updateAll(List<GoodsCommentImg> list) {
        return false;
    }

    @Override
    public boolean updateAll(GoodsCommentImg object, GoodsCommentImgSearchForm form) {
        return false;
    }

    @Override
    public boolean updateAll(GoodsCommentImg object, String searchMapJson) {
        return false;
    }

    @Override
    public boolean updateAll(GoodsCommentImg object, Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public GoodsCommentImg findById(String id) {
        return null;
    }

    @Override
    public GoodsCommentImg find(GoodsCommentImgSearchForm form) {
        return null;
    }

    @Override
    public GoodsCommentImg find(String searchMapJson) {
        return null;
    }

    @Override
    public GoodsCommentImg find(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public List<GoodsCommentImg> search(GoodsCommentImgSearchForm form) {
        return null;
    }

    @Override
    public List<GoodsCommentImg> search(String searchMapJson) {
        return null;
    }

    @Override
    public List<GoodsCommentImg> search(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public GoodsCommentImgSearchForm mapToForm(Map<String, Object> searchMap) {
        return null;
    }
}
