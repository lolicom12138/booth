package xyz.apichiyu.project.service.impl;

import org.springframework.stereotype.Service;
import xyz.apichiyu.project.entity.BoothCat;
import xyz.apichiyu.project.searchForm.BoothCatSearchForm;
import xyz.apichiyu.project.service.BoothCatService;

import java.util.List;
import java.util.Map;

@Service
public class BoothCatServiceImpl implements BoothCatService{

    @Override
    public boolean add(BoothCat object) {
        return false;
    }

    @Override
    public boolean addAll(List<BoothCat> list) {
        return false;
    }

    @Override
    public boolean delete(BoothCat object) {
        return false;
    }

    @Override
    public boolean deleteAll(List<BoothCat> list) {
        return false;
    }

    @Override
    public boolean deleteAll(BoothCatSearchForm form) {
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
    public boolean update(BoothCat object) {
        return false;
    }

    @Override
    public boolean updateAll(List<BoothCat> list) {
        return false;
    }

    @Override
    public boolean updateAll(BoothCat object, BoothCatSearchForm form) {
        return false;
    }

    @Override
    public boolean updateAll(BoothCat object, String searchMapJson) {
        return false;
    }

    @Override
    public boolean updateAll(BoothCat object, Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public BoothCat findById(String id) {
        return null;
    }

    @Override
    public BoothCat find(BoothCatSearchForm form) {
        return null;
    }

    @Override
    public BoothCat find(String searchMapJson) {
        return null;
    }

    @Override
    public BoothCat find(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public List<BoothCat> search(BoothCatSearchForm form) {
        return null;
    }

    @Override
    public List<BoothCat> search(String searchMapJson) {
        return null;
    }

    @Override
    public List<BoothCat> search(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public BoothCatSearchForm mapToForm(Map<String, Object> searchMap) {
        return null;
    }
}
