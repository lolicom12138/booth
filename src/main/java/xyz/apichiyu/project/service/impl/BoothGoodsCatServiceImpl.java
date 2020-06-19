package xyz.apichiyu.project.service.impl;

import org.springframework.stereotype.Service;
import xyz.apichiyu.project.entity.BoothGoodsCat;
import xyz.apichiyu.project.searchForm.BoothGoodsCatSearchForm;
import xyz.apichiyu.project.service.BoothGoodsCatService;

import java.util.List;
import java.util.Map;

@Service
public class BoothGoodsCatServiceImpl implements BoothGoodsCatService{

    @Override
    public boolean add(BoothGoodsCat object) {
        return false;
    }

    @Override
    public boolean addAll(List<BoothGoodsCat> list) {
        return false;
    }

    @Override
    public boolean delete(BoothGoodsCat object) {
        return false;
    }

    @Override
    public boolean deleteAll(List<BoothGoodsCat> list) {
        return false;
    }

    @Override
    public boolean deleteAll(BoothGoodsCatSearchForm form) {
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
    public boolean update(BoothGoodsCat object) {
        return false;
    }

    @Override
    public boolean updateAll(List<BoothGoodsCat> list) {
        return false;
    }

    @Override
    public boolean updateAll(BoothGoodsCat object, BoothGoodsCatSearchForm form) {
        return false;
    }

    @Override
    public boolean updateAll(BoothGoodsCat object, String searchMapJson) {
        return false;
    }

    @Override
    public boolean updateAll(BoothGoodsCat object, Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public BoothGoodsCat findById(String id) {
        return null;
    }

    @Override
    public BoothGoodsCat find(BoothGoodsCatSearchForm form) {
        return null;
    }

    @Override
    public BoothGoodsCat find(String searchMapJson) {
        return null;
    }

    @Override
    public BoothGoodsCat find(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public List<BoothGoodsCat> search(BoothGoodsCatSearchForm form) {
        return null;
    }

    @Override
    public List<BoothGoodsCat> search(String searchMapJson) {
        return null;
    }

    @Override
    public List<BoothGoodsCat> search(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public BoothGoodsCatSearchForm mapToForm(Map<String, Object> searchMap) {
        return null;
    }
}
