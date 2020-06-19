package xyz.apichiyu.project.service.impl;

import org.springframework.stereotype.Service;
import xyz.apichiyu.project.entity.GoodsViewRecord;
import xyz.apichiyu.project.searchForm.GoodsViewRecordSearchForm;
import xyz.apichiyu.project.service.GoodsViewRecordService;

import java.util.List;
import java.util.Map;

@Service
public class GoodsViewRecordServiceImpl implements GoodsViewRecordService{

    @Override
    public boolean add(GoodsViewRecord object) {
        return false;
    }

    @Override
    public boolean addAll(List<GoodsViewRecord> list) {
        return false;
    }

    @Override
    public boolean delete(GoodsViewRecord object) {
        return false;
    }

    @Override
    public boolean deleteAll(List<GoodsViewRecord> list) {
        return false;
    }

    @Override
    public boolean deleteAll(GoodsViewRecordSearchForm form) {
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
    public boolean update(GoodsViewRecord object) {
        return false;
    }

    @Override
    public boolean updateAll(List<GoodsViewRecord> list) {
        return false;
    }

    @Override
    public boolean updateAll(GoodsViewRecord object, GoodsViewRecordSearchForm form) {
        return false;
    }

    @Override
    public boolean updateAll(GoodsViewRecord object, String searchMapJson) {
        return false;
    }

    @Override
    public boolean updateAll(GoodsViewRecord object, Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public GoodsViewRecord findById(String id) {
        return null;
    }

    @Override
    public GoodsViewRecord find(GoodsViewRecordSearchForm form) {
        return null;
    }

    @Override
    public GoodsViewRecord find(String searchMapJson) {
        return null;
    }

    @Override
    public GoodsViewRecord find(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public List<GoodsViewRecord> search(GoodsViewRecordSearchForm form) {
        return null;
    }

    @Override
    public List<GoodsViewRecord> search(String searchMapJson) {
        return null;
    }

    @Override
    public List<GoodsViewRecord> search(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public GoodsViewRecordSearchForm mapToForm(Map<String, Object> searchMap) {
        return null;
    }
}
