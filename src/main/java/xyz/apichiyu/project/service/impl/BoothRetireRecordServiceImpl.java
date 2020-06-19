package xyz.apichiyu.project.service.impl;

import org.springframework.stereotype.Service;
import xyz.apichiyu.project.entity.BoothRetireRecord;
import xyz.apichiyu.project.searchForm.BoothRetireRecordSearchForm;
import xyz.apichiyu.project.service.BoothRetireRecordService;

import java.util.List;
import java.util.Map;

@Service
public class BoothRetireRecordServiceImpl implements BoothRetireRecordService{

    @Override
    public boolean add(BoothRetireRecord object) {
        return false;
    }

    @Override
    public boolean addAll(List<BoothRetireRecord> list) {
        return false;
    }

    @Override
    public boolean delete(BoothRetireRecord object) {
        return false;
    }

    @Override
    public boolean deleteAll(List<BoothRetireRecord> list) {
        return false;
    }

    @Override
    public boolean deleteAll(BoothRetireRecordSearchForm form) {
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
    public boolean update(BoothRetireRecord object) {
        return false;
    }

    @Override
    public boolean updateAll(List<BoothRetireRecord> list) {
        return false;
    }

    @Override
    public boolean updateAll(BoothRetireRecord object, BoothRetireRecordSearchForm form) {
        return false;
    }

    @Override
    public boolean updateAll(BoothRetireRecord object, String searchMapJson) {
        return false;
    }

    @Override
    public boolean updateAll(BoothRetireRecord object, Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public BoothRetireRecord findById(String id) {
        return null;
    }

    @Override
    public BoothRetireRecord find(BoothRetireRecordSearchForm form) {
        return null;
    }

    @Override
    public BoothRetireRecord find(String searchMapJson) {
        return null;
    }

    @Override
    public BoothRetireRecord find(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public List<BoothRetireRecord> search(BoothRetireRecordSearchForm form) {
        return null;
    }

    @Override
    public List<BoothRetireRecord> search(String searchMapJson) {
        return null;
    }

    @Override
    public List<BoothRetireRecord> search(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public BoothRetireRecordSearchForm mapToForm(Map<String, Object> searchMap) {
        return null;
    }
}
