package xyz.apichiyu.project.service.impl;

import org.springframework.stereotype.Service;
import xyz.apichiyu.project.entity.Hongbao;
import xyz.apichiyu.project.searchForm.HongbaoSearchForm;
import xyz.apichiyu.project.service.HongbaoService;

import java.util.List;
import java.util.Map;

@Service
public class HongbaoServiceImpl implements HongbaoService{

    @Override
    public boolean add(Hongbao object) {
        return false;
    }

    @Override
    public boolean addAll(List<Hongbao> list) {
        return false;
    }

    @Override
    public boolean delete(Hongbao object) {
        return false;
    }

    @Override
    public boolean deleteAll(List<Hongbao> list) {
        return false;
    }

    @Override
    public boolean deleteAll(HongbaoSearchForm form) {
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
    public boolean update(Hongbao object) {
        return false;
    }

    @Override
    public boolean updateAll(List<Hongbao> list) {
        return false;
    }

    @Override
    public boolean updateAll(Hongbao object, HongbaoSearchForm form) {
        return false;
    }

    @Override
    public boolean updateAll(Hongbao object, String searchMapJson) {
        return false;
    }

    @Override
    public boolean updateAll(Hongbao object, Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public Hongbao findById(String id) {
        return null;
    }

    @Override
    public Hongbao find(HongbaoSearchForm form) {
        return null;
    }

    @Override
    public Hongbao find(String searchMapJson) {
        return null;
    }

    @Override
    public Hongbao find(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public List<Hongbao> search(HongbaoSearchForm form) {
        return null;
    }

    @Override
    public List<Hongbao> search(String searchMapJson) {
        return null;
    }

    @Override
    public List<Hongbao> search(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public HongbaoSearchForm mapToForm(Map<String, Object> searchMap) {
        return null;
    }
}
