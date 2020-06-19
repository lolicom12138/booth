package xyz.apichiyu.project.service.impl;

import org.springframework.stereotype.Service;
import xyz.apichiyu.project.entity.BoothApply;
import xyz.apichiyu.project.entity.BoothApplyImg;
import xyz.apichiyu.project.searchForm.BoothApplyImgSearchForm;
import xyz.apichiyu.project.searchForm.BoothApplySearchForm;
import xyz.apichiyu.project.service.BoothApplyImgService;

import java.util.List;
import java.util.Map;

@Service
public class BoothApplyImgServiceImpl implements BoothApplyImgService {

    @Override
    public boolean add(BoothApplyImg object) {
        return false;
    }

    @Override
    public boolean addAll(List<BoothApplyImg> list) {
        return false;
    }

    @Override
    public boolean delete(BoothApplyImg object) {
        return false;
    }

    @Override
    public boolean deleteAll(List<BoothApplyImg> list) {
        return false;
    }

    @Override
    public boolean deleteAll(BoothApplyImgSearchForm form) {
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
    public boolean update(BoothApplyImg object) {
        return false;
    }

    @Override
    public boolean updateAll(List<BoothApplyImg> list) {
        return false;
    }

    @Override
    public boolean updateAll(BoothApplyImg object, BoothApplyImgSearchForm form) {
        return false;
    }

    @Override
    public boolean updateAll(BoothApplyImg object, String searchMapJson) {
        return false;
    }

    @Override
    public boolean updateAll(BoothApplyImg object, Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public BoothApplyImg findById(String id) {
        return null;
    }

    @Override
    public BoothApplyImg find(BoothApplyImgSearchForm form) {
        return null;
    }

    @Override
    public BoothApplyImg find(String searchMapJson) {
        return null;
    }

    @Override
    public BoothApplyImg find(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public List<BoothApplyImg> search(BoothApplyImgSearchForm form) {
        return null;
    }

    @Override
    public List<BoothApplyImg> search(String searchMapJson) {
        return null;
    }

    @Override
    public List<BoothApplyImg> search(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public BoothApplyImgSearchForm mapToForm(Map<String, Object> searchMap) {
        return null;
    }
}
