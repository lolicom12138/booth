package xyz.apichiyu.project.service.impl;

import org.springframework.stereotype.Service;
import xyz.apichiyu.project.entity.BoothImg;
import xyz.apichiyu.project.searchForm.BoothImgSearchForm;
import xyz.apichiyu.project.service.BoothImgService;

import java.util.List;
import java.util.Map;

@Service
public class BoothImgServiceImpl implements BoothImgService{

    @Override
    public boolean add(BoothImg object) {
        return false;
    }

    @Override
    public boolean addAll(List<BoothImg> list) {
        return false;
    }

    @Override
    public boolean delete(BoothImg object) {
        return false;
    }

    @Override
    public boolean deleteAll(List<BoothImg> list) {
        return false;
    }

    @Override
    public boolean deleteAll(BoothImgSearchForm form) {
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
    public boolean update(BoothImg object) {
        return false;
    }

    @Override
    public boolean updateAll(List<BoothImg> list) {
        return false;
    }

    @Override
    public boolean updateAll(BoothImg object, BoothImgSearchForm form) {
        return false;
    }

    @Override
    public boolean updateAll(BoothImg object, String searchMapJson) {
        return false;
    }

    @Override
    public boolean updateAll(BoothImg object, Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public BoothImg findById(String id) {
        return null;
    }

    @Override
    public BoothImg find(BoothImgSearchForm form) {
        return null;
    }

    @Override
    public BoothImg find(String searchMapJson) {
        return null;
    }

    @Override
    public BoothImg find(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public List<BoothImg> search(BoothImgSearchForm form) {
        return null;
    }

    @Override
    public List<BoothImg> search(String searchMapJson) {
        return null;
    }

    @Override
    public List<BoothImg> search(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public BoothImgSearchForm mapToForm(Map<String, Object> searchMap) {
        return null;
    }
}
