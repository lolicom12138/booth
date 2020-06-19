package xyz.apichiyu.project.service.impl;

import org.springframework.stereotype.Service;
import xyz.apichiyu.project.entity.BoothAdmin;
import xyz.apichiyu.project.searchForm.BoothAdminSearchForm;
import xyz.apichiyu.project.service.BoothAdminService;

import java.util.List;
import java.util.Map;

@Service
public class BoothAdminServiceImpl implements BoothAdminService{

    @Override
    public boolean add(BoothAdmin object) {
        return false;
    }

    @Override
    public boolean addAll(List<BoothAdmin> list) {
        return false;
    }

    @Override
    public boolean delete(BoothAdmin object) {
        return false;
    }

    @Override
    public boolean deleteAll(List<BoothAdmin> list) {
        return false;
    }

    @Override
    public boolean deleteAll(BoothAdminSearchForm form) {
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
    public boolean update(BoothAdmin object) {
        return false;
    }

    @Override
    public boolean updateAll(List<BoothAdmin> list) {
        return false;
    }

    @Override
    public boolean updateAll(BoothAdmin object, BoothAdminSearchForm form) {
        return false;
    }

    @Override
    public boolean updateAll(BoothAdmin object, String searchMapJson) {
        return false;
    }

    @Override
    public boolean updateAll(BoothAdmin object, Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public BoothAdmin findById(String id) {
        return null;
    }

    @Override
    public BoothAdmin find(BoothAdminSearchForm form) {
        return null;
    }

    @Override
    public BoothAdmin find(String searchMapJson) {
        return null;
    }

    @Override
    public BoothAdmin find(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public List<BoothAdmin> search(BoothAdminSearchForm form) {
        return null;
    }

    @Override
    public List<BoothAdmin> search(String searchMapJson) {
        return null;
    }

    @Override
    public List<BoothAdmin> search(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public BoothAdminSearchForm mapToForm(Map<String, Object> searchMap) {
        return null;
    }
}
