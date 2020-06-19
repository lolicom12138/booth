package xyz.apichiyu.project.service.impl;

import org.springframework.stereotype.Service;
import xyz.apichiyu.project.entity.BoothLiveRecord;
import xyz.apichiyu.project.searchForm.BoothLiveRecordSearchForm;
import xyz.apichiyu.project.service.BoothLiveRecordService;

import java.util.List;
import java.util.Map;

@Service
public class BoothLiveRecordServiceImpl implements BoothLiveRecordService{

    @Override
    public boolean add(BoothLiveRecord object) {
        return false;
    }

    @Override
    public boolean addAll(List<BoothLiveRecord> list) {
        return false;
    }

    @Override
    public boolean delete(BoothLiveRecord object) {
        return false;
    }

    @Override
    public boolean deleteAll(List<BoothLiveRecord> list) {
        return false;
    }

    @Override
    public boolean deleteAll(BoothLiveRecordSearchForm form) {
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
    public boolean update(BoothLiveRecord object) {
        return false;
    }

    @Override
    public boolean updateAll(List<BoothLiveRecord> list) {
        return false;
    }

    @Override
    public boolean updateAll(BoothLiveRecord object, BoothLiveRecordSearchForm form) {
        return false;
    }

    @Override
    public boolean updateAll(BoothLiveRecord object, String searchMapJson) {
        return false;
    }

    @Override
    public boolean updateAll(BoothLiveRecord object, Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public BoothLiveRecord findById(String id) {
        return null;
    }

    @Override
    public BoothLiveRecord find(BoothLiveRecordSearchForm form) {
        return null;
    }

    @Override
    public BoothLiveRecord find(String searchMapJson) {
        return null;
    }

    @Override
    public BoothLiveRecord find(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public List<BoothLiveRecord> search(BoothLiveRecordSearchForm form) {
        return null;
    }

    @Override
    public List<BoothLiveRecord> search(String searchMapJson) {
        return null;
    }

    @Override
    public List<BoothLiveRecord> search(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public BoothLiveRecordSearchForm mapToForm(Map<String, Object> searchMap) {
        return null;
    }
}
