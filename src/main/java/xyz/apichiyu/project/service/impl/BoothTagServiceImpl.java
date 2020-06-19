package xyz.apichiyu.project.service.impl;

import org.springframework.stereotype.Service;
import xyz.apichiyu.project.entity.BoothTag;
import xyz.apichiyu.project.searchForm.BoothTagSearchForm;
import xyz.apichiyu.project.service.BoothTagService;

import java.util.List;
import java.util.Map;

@Service
public class BoothTagServiceImpl implements BoothTagService{

    @Override
    public boolean add(BoothTag object) {
        return false;
    }

    @Override
    public boolean addAll(List<BoothTag> list) {
        return false;
    }

    @Override
    public boolean delete(BoothTag object) {
        return false;
    }

    @Override
    public boolean deleteAll(List<BoothTag> list) {
        return false;
    }

    @Override
    public boolean deleteAll(BoothTagSearchForm form) {
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
    public boolean update(BoothTag object) {
        return false;
    }

    @Override
    public boolean updateAll(List<BoothTag> list) {
        return false;
    }

    @Override
    public boolean updateAll(BoothTag object, BoothTagSearchForm form) {
        return false;
    }

    @Override
    public boolean updateAll(BoothTag object, String searchMapJson) {
        return false;
    }

    @Override
    public boolean updateAll(BoothTag object, Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public BoothTag findById(String id) {
        return null;
    }

    @Override
    public BoothTag find(BoothTagSearchForm form) {
        return null;
    }

    @Override
    public BoothTag find(String searchMapJson) {
        return null;
    }

    @Override
    public BoothTag find(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public List<BoothTag> search(BoothTagSearchForm form) {
        return null;
    }

    @Override
    public List<BoothTag> search(String searchMapJson) {
        return null;
    }

    @Override
    public List<BoothTag> search(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public BoothTagSearchForm mapToForm(Map<String, Object> searchMap) {
        return null;
    }
}
