package xyz.apichiyu.project.service.impl;

import org.springframework.stereotype.Service;
import xyz.apichiyu.project.entity.BoothAdminActionRecord;
import xyz.apichiyu.project.searchForm.BoothAdminActionRecordSearchForm;
import xyz.apichiyu.project.service.BoothAdminActionRecordService;

import java.util.List;
import java.util.Map;

@Service
public class BoothAdminActionRecordServiceImpl implements BoothAdminActionRecordService{

    @Override
    public boolean add(BoothAdminActionRecord object) {
        return false;
    }

    @Override
    public boolean addAll(List<BoothAdminActionRecord> list) {
        return false;
    }

    @Override
    public boolean delete(BoothAdminActionRecord object) {
        return false;
    }

    @Override
    public boolean deleteAll(List<BoothAdminActionRecord> list) {
        return false;
    }

    @Override
    public boolean deleteAll(BoothAdminActionRecordSearchForm form) {
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
    public boolean update(BoothAdminActionRecord object) {
        return false;
    }

    @Override
    public boolean updateAll(List<BoothAdminActionRecord> list) {
        return false;
    }

    @Override
    public boolean updateAll(BoothAdminActionRecord object, BoothAdminActionRecordSearchForm form) {
        return false;
    }

    @Override
    public boolean updateAll(BoothAdminActionRecord object, String searchMapJson) {
        return false;
    }

    @Override
    public boolean updateAll(BoothAdminActionRecord object, Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public BoothAdminActionRecord findById(String id) {
        return null;
    }

    @Override
    public BoothAdminActionRecord find(BoothAdminActionRecordSearchForm form) {
        return null;
    }

    @Override
    public BoothAdminActionRecord find(String searchMapJson) {
        return null;
    }

    @Override
    public BoothAdminActionRecord find(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public List<BoothAdminActionRecord> search(BoothAdminActionRecordSearchForm form) {
        return null;
    }

    @Override
    public List<BoothAdminActionRecord> search(String searchMapJson) {
        return null;
    }

    @Override
    public List<BoothAdminActionRecord> search(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public BoothAdminActionRecordSearchForm mapToForm(Map<String, Object> searchMap) {
        return null;
    }
}
