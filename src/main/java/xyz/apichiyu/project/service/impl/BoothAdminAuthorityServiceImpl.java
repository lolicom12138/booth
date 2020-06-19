package xyz.apichiyu.project.service.impl;

import org.springframework.stereotype.Service;
import xyz.apichiyu.project.entity.BoothAdminAuthority;
import xyz.apichiyu.project.searchForm.BoothAdminAuthoritySearchForm;
import xyz.apichiyu.project.service.BoothAdminAuthorityService;

import java.util.List;
import java.util.Map;

@Service
public class BoothAdminAuthorityServiceImpl implements BoothAdminAuthorityService{

    @Override
    public boolean add(BoothAdminAuthority object) {
        return false;
    }

    @Override
    public boolean addAll(List<BoothAdminAuthority> list) {
        return false;
    }

    @Override
    public boolean delete(BoothAdminAuthority object) {
        return false;
    }

    @Override
    public boolean deleteAll(List<BoothAdminAuthority> list) {
        return false;
    }

    @Override
    public boolean deleteAll(BoothAdminAuthoritySearchForm form) {
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
    public boolean update(BoothAdminAuthority object) {
        return false;
    }

    @Override
    public boolean updateAll(List<BoothAdminAuthority> list) {
        return false;
    }

    @Override
    public boolean updateAll(BoothAdminAuthority object, BoothAdminAuthoritySearchForm form) {
        return false;
    }

    @Override
    public boolean updateAll(BoothAdminAuthority object, String searchMapJson) {
        return false;
    }

    @Override
    public boolean updateAll(BoothAdminAuthority object, Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public BoothAdminAuthority findById(String id) {
        return null;
    }

    @Override
    public BoothAdminAuthority find(BoothAdminAuthoritySearchForm form) {
        return null;
    }

    @Override
    public BoothAdminAuthority find(String searchMapJson) {
        return null;
    }

    @Override
    public BoothAdminAuthority find(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public List<BoothAdminAuthority> search(BoothAdminAuthoritySearchForm form) {
        return null;
    }

    @Override
    public List<BoothAdminAuthority> search(String searchMapJson) {
        return null;
    }

    @Override
    public List<BoothAdminAuthority> search(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public BoothAdminAuthoritySearchForm mapToForm(Map<String, Object> searchMap) {
        return null;
    }
}
