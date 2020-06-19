package xyz.apichiyu.project.service.impl;

import org.springframework.stereotype.Service;
import xyz.apichiyu.project.entity.BoothMoneyRecord;
import xyz.apichiyu.project.searchForm.BoothMoneyRecordSearchForm;
import xyz.apichiyu.project.service.BoothMoneyRecordService;

import java.util.List;
import java.util.Map;

@Service
public class BoothMoneyRecordServiceImpl implements BoothMoneyRecordService{

    @Override
    public boolean add(BoothMoneyRecord object) {
        return false;
    }

    @Override
    public boolean addAll(List<BoothMoneyRecord> list) {
        return false;
    }

    @Override
    public boolean delete(BoothMoneyRecord object) {
        return false;
    }

    @Override
    public boolean deleteAll(List<BoothMoneyRecord> list) {
        return false;
    }

    @Override
    public boolean deleteAll(BoothMoneyRecordSearchForm form) {
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
    public boolean update(BoothMoneyRecord object) {
        return false;
    }

    @Override
    public boolean updateAll(List<BoothMoneyRecord> list) {
        return false;
    }

    @Override
    public boolean updateAll(BoothMoneyRecord object, BoothMoneyRecordSearchForm form) {
        return false;
    }

    @Override
    public boolean updateAll(BoothMoneyRecord object, String searchMapJson) {
        return false;
    }

    @Override
    public boolean updateAll(BoothMoneyRecord object, Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public BoothMoneyRecord findById(String id) {
        return null;
    }

    @Override
    public BoothMoneyRecord find(BoothMoneyRecordSearchForm form) {
        return null;
    }

    @Override
    public BoothMoneyRecord find(String searchMapJson) {
        return null;
    }

    @Override
    public BoothMoneyRecord find(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public List<BoothMoneyRecord> search(BoothMoneyRecordSearchForm form) {
        return null;
    }

    @Override
    public List<BoothMoneyRecord> search(String searchMapJson) {
        return null;
    }

    @Override
    public List<BoothMoneyRecord> search(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public BoothMoneyRecordSearchForm mapToForm(Map<String, Object> searchMap) {
        return null;
    }
}
