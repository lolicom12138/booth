package xyz.apichiyu.project.service.impl;

import org.springframework.stereotype.Service;
import xyz.apichiyu.project.entity.City;
import xyz.apichiyu.project.searchForm.CitySearchForm;
import xyz.apichiyu.project.service.CityService;

import java.util.List;
import java.util.Map;

@Service
public class CityServiceImpl implements CityService{

    @Override
    public boolean add(City object) {
        return false;
    }

    @Override
    public boolean addAll(List<City> list) {
        return false;
    }

    @Override
    public boolean delete(City object) {
        return false;
    }

    @Override
    public boolean deleteAll(List<City> list) {
        return false;
    }

    @Override
    public boolean deleteAll(CitySearchForm form) {
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
    public boolean update(City object) {
        return false;
    }

    @Override
    public boolean updateAll(List<City> list) {
        return false;
    }

    @Override
    public boolean updateAll(City object, CitySearchForm form) {
        return false;
    }

    @Override
    public boolean updateAll(City object, String searchMapJson) {
        return false;
    }

    @Override
    public boolean updateAll(City object, Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public City findById(String id) {
        return null;
    }

    @Override
    public City find(CitySearchForm form) {
        return null;
    }

    @Override
    public City find(String searchMapJson) {
        return null;
    }

    @Override
    public City find(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public List<City> search(CitySearchForm form) {
        return null;
    }

    @Override
    public List<City> search(String searchMapJson) {
        return null;
    }

    @Override
    public List<City> search(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public CitySearchForm mapToForm(Map<String, Object> searchMap) {
        return null;
    }
}
