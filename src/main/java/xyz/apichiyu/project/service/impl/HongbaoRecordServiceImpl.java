package xyz.apichiyu.project.service.impl;

import org.springframework.stereotype.Service;
import xyz.apichiyu.project.entity.HongbaoRecord;
import xyz.apichiyu.project.searchForm.HongbaoRecordSearchForm;
import xyz.apichiyu.project.service.HongbaoRecordService;

import java.util.List;
import java.util.Map;

@Service
public class HongbaoRecordServiceImpl implements HongbaoRecordService{

    @Override
    public boolean add(HongbaoRecord object) {
        return false;
    }

    @Override
    public boolean addAll(List<HongbaoRecord> list) {
        return false;
    }

    @Override
    public boolean delete(HongbaoRecord object) {
        return false;
    }

    @Override
    public boolean deleteAll(List<HongbaoRecord> list) {
        return false;
    }

    @Override
    public boolean deleteAll(HongbaoRecordSearchForm form) {
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
    public boolean update(HongbaoRecord object) {
        return false;
    }

    @Override
    public boolean updateAll(List<HongbaoRecord> list) {
        return false;
    }

    @Override
    public boolean updateAll(HongbaoRecord object, HongbaoRecordSearchForm form) {
        return false;
    }

    @Override
    public boolean updateAll(HongbaoRecord object, String searchMapJson) {
        return false;
    }

    @Override
    public boolean updateAll(HongbaoRecord object, Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public HongbaoRecord findById(String id) {
        return null;
    }

    @Override
    public HongbaoRecord find(HongbaoRecordSearchForm form) {
        return null;
    }

    @Override
    public HongbaoRecord find(String searchMapJson) {
        return null;
    }

    @Override
    public HongbaoRecord find(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public List<HongbaoRecord> search(HongbaoRecordSearchForm form) {
        return null;
    }

    @Override
    public List<HongbaoRecord> search(String searchMapJson) {
        return null;
    }

    @Override
    public List<HongbaoRecord> search(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public HongbaoRecordSearchForm mapToForm(Map<String, Object> searchMap) {
        return null;
    }
}
