package xyz.apichiyu.project.service.impl;

import org.springframework.stereotype.Service;
import xyz.apichiyu.project.entity.Province;
import xyz.apichiyu.project.searchForm.ProvinceSearchForm;
import xyz.apichiyu.project.service.ProvinceService;

import java.util.List;
import java.util.Map;

@Service
public class ProvinceServiceImpl implements ProvinceService{

    @Override
    public boolean add(Province object) {
        return false;
    }

    @Override
    public boolean addAll(List<Province> list) {
        return false;
    }

    @Override
    public boolean delete(Province object) {
        return false;
    }

    @Override
    public boolean deleteAll(List<Province> list) {
        return false;
    }

    @Override
    public boolean deleteAll(ProvinceSearchForm form) {
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
    public boolean update(Province object) {
        return false;
    }

    @Override
    public boolean updateAll(List<Province> list) {
        return false;
    }

    @Override
    public boolean updateAll(Province object, ProvinceSearchForm form) {
        return false;
    }

    @Override
    public boolean updateAll(Province object, String searchMapJson) {
        return false;
    }

    @Override
    public boolean updateAll(Province object, Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public Province findById(String id) {
        return null;
    }

    @Override
    public Province find(ProvinceSearchForm form) {
        return null;
    }

    @Override
    public Province find(String searchMapJson) {
        return null;
    }

    @Override
    public Province find(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public List<Province> search(ProvinceSearchForm form) {
        return null;
    }

    @Override
    public List<Province> search(String searchMapJson) {
        return null;
    }

    @Override
    public List<Province> search(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public ProvinceSearchForm mapToForm(Map<String, Object> searchMap) {
        return null;
    }
}
