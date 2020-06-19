package xyz.apichiyu.project.service.impl;

import org.springframework.stereotype.Service;
import xyz.apichiyu.project.entity.BoothPoint;
import xyz.apichiyu.project.searchForm.BoothPointSearchForm;
import xyz.apichiyu.project.service.BoothPointService;

import java.util.List;
import java.util.Map;

@Service
public class BoothPointServiceImpl implements BoothPointService{

    @Override
    public boolean add(BoothPoint object) {
        return false;
    }

    @Override
    public boolean addAll(List<BoothPoint> list) {
        return false;
    }

    @Override
    public boolean delete(BoothPoint object) {
        return false;
    }

    @Override
    public boolean deleteAll(List<BoothPoint> list) {
        return false;
    }

    @Override
    public boolean deleteAll(BoothPointSearchForm form) {
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
    public boolean update(BoothPoint object) {
        return false;
    }

    @Override
    public boolean updateAll(List<BoothPoint> list) {
        return false;
    }

    @Override
    public boolean updateAll(BoothPoint object, BoothPointSearchForm form) {
        return false;
    }

    @Override
    public boolean updateAll(BoothPoint object, String searchMapJson) {
        return false;
    }

    @Override
    public boolean updateAll(BoothPoint object, Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public BoothPoint findById(String id) {
        return null;
    }

    @Override
    public BoothPoint find(BoothPointSearchForm form) {
        return null;
    }

    @Override
    public BoothPoint find(String searchMapJson) {
        return null;
    }

    @Override
    public BoothPoint find(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public List<BoothPoint> search(BoothPointSearchForm form) {
        return null;
    }

    @Override
    public List<BoothPoint> search(String searchMapJson) {
        return null;
    }

    @Override
    public List<BoothPoint> search(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public BoothPointSearchForm mapToForm(Map<String, Object> searchMap) {
        return null;
    }
}
