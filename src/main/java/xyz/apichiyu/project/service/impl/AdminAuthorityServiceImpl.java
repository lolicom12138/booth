package xyz.apichiyu.project.service.impl;

import org.springframework.stereotype.Service;
import xyz.apichiyu.project.entity.AdminAuthority;
import xyz.apichiyu.project.searchForm.AdminAuthoritySearchForm;
import xyz.apichiyu.project.service.AdminAuthorityService;
import xyz.apichiyu.project.service.BaseService;

import java.util.List;
import java.util.Map;

@Service
public class AdminAuthorityServiceImpl implements AdminAuthorityService{

    @Override
    public boolean add(AdminAuthority object) {
        return false;
    }

    @Override
    public boolean addAll(List<AdminAuthority> list) {
        return false;
    }

    @Override
    public boolean delete(AdminAuthority object) {
        return false;
    }

    @Override
    public boolean deleteAll(List<AdminAuthority> list) {
        return false;
    }

    @Override
    public boolean deleteAll(AdminAuthoritySearchForm form) {
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
    public boolean update(AdminAuthority object) {
        return false;
    }

    @Override
    public boolean updateAll(List<AdminAuthority> list) {
        return false;
    }

    @Override
    public boolean updateAll(AdminAuthority object, AdminAuthoritySearchForm form) {
        return false;
    }

    @Override
    public boolean updateAll(AdminAuthority object, String searchMapJson) {
        return false;
    }

    @Override
    public boolean updateAll(AdminAuthority object, Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public AdminAuthority findById(String id) {
        return null;
    }

    @Override
    public AdminAuthority find(AdminAuthoritySearchForm form) {
        return null;
    }

    @Override
    public AdminAuthority find(String searchMapJson) {
        return null;
    }

    @Override
    public AdminAuthority find(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public List<AdminAuthority> search(AdminAuthoritySearchForm form) {
        return null;
    }

    @Override
    public List<AdminAuthority> search(String searchMapJson) {
        return null;
    }

    @Override
    public List<AdminAuthority> search(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public AdminAuthoritySearchForm mapToForm(Map<String, Object> searchMap) {
        return null;
    }
}
