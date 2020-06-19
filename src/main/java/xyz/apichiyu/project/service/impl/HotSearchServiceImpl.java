package xyz.apichiyu.project.service.impl;

import org.springframework.stereotype.Service;
import xyz.apichiyu.project.entity.HotSearch;
import xyz.apichiyu.project.searchForm.HotSearchSearchForm;
import xyz.apichiyu.project.service.HotSearchService;

import java.util.List;
import java.util.Map;

@Service
public class HotSearchServiceImpl implements HotSearchService{

    @Override
    public boolean add(HotSearch object) {
        return false;
    }

    @Override
    public boolean addAll(List<HotSearch> list) {
        return false;
    }

    @Override
    public boolean delete(HotSearch object) {
        return false;
    }

    @Override
    public boolean deleteAll(List<HotSearch> list) {
        return false;
    }

    @Override
    public boolean deleteAll(HotSearchSearchForm form) {
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
    public boolean update(HotSearch object) {
        return false;
    }

    @Override
    public boolean updateAll(List<HotSearch> list) {
        return false;
    }

    @Override
    public boolean updateAll(HotSearch object, HotSearchSearchForm form) {
        return false;
    }

    @Override
    public boolean updateAll(HotSearch object, String searchMapJson) {
        return false;
    }

    @Override
    public boolean updateAll(HotSearch object, Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public HotSearch findById(String id) {
        return null;
    }

    @Override
    public HotSearch find(HotSearchSearchForm form) {
        return null;
    }

    @Override
    public HotSearch find(String searchMapJson) {
        return null;
    }

    @Override
    public HotSearch find(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public List<HotSearch> search(HotSearchSearchForm form) {
        return null;
    }

    @Override
    public List<HotSearch> search(String searchMapJson) {
        return null;
    }

    @Override
    public List<HotSearch> search(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public HotSearchSearchForm mapToForm(Map<String, Object> searchMap) {
        return null;
    }
}
