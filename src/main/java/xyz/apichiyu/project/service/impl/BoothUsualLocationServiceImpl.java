package xyz.apichiyu.project.service.impl;

import org.springframework.stereotype.Service;
import xyz.apichiyu.project.entity.BoothUsualLocation;
import xyz.apichiyu.project.searchForm.BoothUsualLocationSearchForm;
import xyz.apichiyu.project.service.BoothUsualLocationService;

import java.util.List;
import java.util.Map;

@Service
public class BoothUsualLocationServiceImpl implements BoothUsualLocationService{

    @Override
    public boolean add(BoothUsualLocation object) {
        return false;
    }

    @Override
    public boolean addAll(List<BoothUsualLocation> list) {
        return false;
    }

    @Override
    public boolean delete(BoothUsualLocation object) {
        return false;
    }

    @Override
    public boolean deleteAll(List<BoothUsualLocation> list) {
        return false;
    }

    @Override
    public boolean deleteAll(BoothUsualLocationSearchForm form) {
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
    public boolean update(BoothUsualLocation object) {
        return false;
    }

    @Override
    public boolean updateAll(List<BoothUsualLocation> list) {
        return false;
    }

    @Override
    public boolean updateAll(BoothUsualLocation object, BoothUsualLocationSearchForm form) {
        return false;
    }

    @Override
    public boolean updateAll(BoothUsualLocation object, String searchMapJson) {
        return false;
    }

    @Override
    public boolean updateAll(BoothUsualLocation object, Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public BoothUsualLocation findById(String id) {
        return null;
    }

    @Override
    public BoothUsualLocation find(BoothUsualLocationSearchForm form) {
        return null;
    }

    @Override
    public BoothUsualLocation find(String searchMapJson) {
        return null;
    }

    @Override
    public BoothUsualLocation find(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public List<BoothUsualLocation> search(BoothUsualLocationSearchForm form) {
        return null;
    }

    @Override
    public List<BoothUsualLocation> search(String searchMapJson) {
        return null;
    }

    @Override
    public List<BoothUsualLocation> search(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public BoothUsualLocationSearchForm mapToForm(Map<String, Object> searchMap) {
        return null;
    }
}
