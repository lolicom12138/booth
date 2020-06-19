package xyz.apichiyu.project.service.impl;

import org.springframework.stereotype.Service;
import xyz.apichiyu.project.entity.Booth;
import xyz.apichiyu.project.searchForm.BoothSearchForm;
import xyz.apichiyu.project.service.BoothService;

import java.util.List;
import java.util.Map;

@Service
public class BoothServiceImpl implements BoothService{

    @Override
    public boolean add(Booth object) {
        return false;
    }

    @Override
    public boolean addAll(List<Booth> list) {
        return false;
    }

    @Override
    public boolean delete(Booth object) {
        return false;
    }

    @Override
    public boolean deleteAll(List<Booth> list) {
        return false;
    }

    @Override
    public boolean deleteAll(BoothSearchForm form) {
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
    public boolean update(Booth object) {
        return false;
    }

    @Override
    public boolean updateAll(List<Booth> list) {
        return false;
    }

    @Override
    public boolean updateAll(Booth object, BoothSearchForm form) {
        return false;
    }

    @Override
    public boolean updateAll(Booth object, String searchMapJson) {
        return false;
    }

    @Override
    public boolean updateAll(Booth object, Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public Booth findById(String id) {
        return null;
    }

    @Override
    public Booth find(BoothSearchForm form) {
        return null;
    }

    @Override
    public Booth find(String searchMapJson) {
        return null;
    }

    @Override
    public Booth find(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public List<Booth> search(BoothSearchForm form) {
        return null;
    }

    @Override
    public List<Booth> search(String searchMapJson) {
        return null;
    }

    @Override
    public List<Booth> search(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public BoothSearchForm mapToForm(Map<String, Object> searchMap) {
        return null;
    }
}
