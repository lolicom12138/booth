package xyz.apichiyu.project.service.impl;

import org.springframework.stereotype.Service;
import xyz.apichiyu.project.entity.BoothAdmin;
import xyz.apichiyu.project.entity.BoothApply;
import xyz.apichiyu.project.searchForm.BoothAdminSearchForm;
import xyz.apichiyu.project.searchForm.BoothApplySearchForm;
import xyz.apichiyu.project.service.BoothApplyService;

import java.util.List;
import java.util.Map;

@Service
public class BoothApplyServiceImpl implements BoothApplyService {

    @Override
    public boolean add(BoothApply object) {
        return false;
    }

    @Override
    public boolean addAll(List<BoothApply> list) {
        return false;
    }

    @Override
    public boolean delete(BoothApply object) {
        return false;
    }

    @Override
    public boolean deleteAll(List<BoothApply> list) {
        return false;
    }

    @Override
    public boolean deleteAll(BoothApplySearchForm form) {
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
    public boolean update(BoothApply object) {
        return false;
    }

    @Override
    public boolean updateAll(List<BoothApply> list) {
        return false;
    }

    @Override
    public boolean updateAll(BoothApply object, BoothApplySearchForm form) {
        return false;
    }

    @Override
    public boolean updateAll(BoothApply object, String searchMapJson) {
        return false;
    }

    @Override
    public boolean updateAll(BoothApply object, Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public BoothApply findById(String id) {
        return null;
    }

    @Override
    public BoothApply find(BoothApplySearchForm form) {
        return null;
    }

    @Override
    public BoothApply find(String searchMapJson) {
        return null;
    }

    @Override
    public BoothApply find(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public List<BoothApply> search(BoothApplySearchForm form) {
        return null;
    }

    @Override
    public List<BoothApply> search(String searchMapJson) {
        return null;
    }

    @Override
    public List<BoothApply> search(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public BoothApplySearchForm mapToForm(Map<String, Object> searchMap) {
        return null;
    }
}
