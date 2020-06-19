package xyz.apichiyu.project.service.impl;

import org.springframework.stereotype.Service;
import xyz.apichiyu.project.entity.BoothPopular;
import xyz.apichiyu.project.searchForm.BoothPopularSearchForm;
import xyz.apichiyu.project.service.BoothPopularService;

import java.util.List;
import java.util.Map;

@Service
public class BoothPopularServiceImpl implements BoothPopularService{

    @Override
    public boolean add(BoothPopular object) {
        return false;
    }

    @Override
    public boolean addAll(List<BoothPopular> list) {
        return false;
    }

    @Override
    public boolean delete(BoothPopular object) {
        return false;
    }

    @Override
    public boolean deleteAll(List<BoothPopular> list) {
        return false;
    }

    @Override
    public boolean deleteAll(BoothPopularSearchForm form) {
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
    public boolean update(BoothPopular object) {
        return false;
    }

    @Override
    public boolean updateAll(List<BoothPopular> list) {
        return false;
    }

    @Override
    public boolean updateAll(BoothPopular object, BoothPopularSearchForm form) {
        return false;
    }

    @Override
    public boolean updateAll(BoothPopular object, String searchMapJson) {
        return false;
    }

    @Override
    public boolean updateAll(BoothPopular object, Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public BoothPopular findById(String id) {
        return null;
    }

    @Override
    public BoothPopular find(BoothPopularSearchForm form) {
        return null;
    }

    @Override
    public BoothPopular find(String searchMapJson) {
        return null;
    }

    @Override
    public BoothPopular find(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public List<BoothPopular> search(BoothPopularSearchForm form) {
        return null;
    }

    @Override
    public List<BoothPopular> search(String searchMapJson) {
        return null;
    }

    @Override
    public List<BoothPopular> search(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public BoothPopularSearchForm mapToForm(Map<String, Object> searchMap) {
        return null;
    }
}
