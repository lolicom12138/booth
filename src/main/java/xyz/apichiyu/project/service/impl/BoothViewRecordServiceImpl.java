package xyz.apichiyu.project.service.impl;

import org.springframework.stereotype.Service;
import xyz.apichiyu.project.entity.BoothViewRecord;
import xyz.apichiyu.project.searchForm.BoothViewRecordSearchForm;
import xyz.apichiyu.project.service.BoothViewRecordService;

import java.util.List;
import java.util.Map;

@Service
public class BoothViewRecordServiceImpl implements BoothViewRecordService{

    @Override
    public boolean add(BoothViewRecord object) {
        return false;
    }

    @Override
    public boolean addAll(List<BoothViewRecord> list) {
        return false;
    }

    @Override
    public boolean delete(BoothViewRecord object) {
        return false;
    }

    @Override
    public boolean deleteAll(List<BoothViewRecord> list) {
        return false;
    }

    @Override
    public boolean deleteAll(BoothViewRecordSearchForm form) {
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
    public boolean update(BoothViewRecord object) {
        return false;
    }

    @Override
    public boolean updateAll(List<BoothViewRecord> list) {
        return false;
    }

    @Override
    public boolean updateAll(BoothViewRecord object, BoothViewRecordSearchForm form) {
        return false;
    }

    @Override
    public boolean updateAll(BoothViewRecord object, String searchMapJson) {
        return false;
    }

    @Override
    public boolean updateAll(BoothViewRecord object, Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public BoothViewRecord findById(String id) {
        return null;
    }

    @Override
    public BoothViewRecord find(BoothViewRecordSearchForm form) {
        return null;
    }

    @Override
    public BoothViewRecord find(String searchMapJson) {
        return null;
    }

    @Override
    public BoothViewRecord find(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public List<BoothViewRecord> search(BoothViewRecordSearchForm form) {
        return null;
    }

    @Override
    public List<BoothViewRecord> search(String searchMapJson) {
        return null;
    }

    @Override
    public List<BoothViewRecord> search(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public BoothViewRecordSearchForm mapToForm(Map<String, Object> searchMap) {
        return null;
    }
}
