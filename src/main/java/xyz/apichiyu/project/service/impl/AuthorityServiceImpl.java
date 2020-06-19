package xyz.apichiyu.project.service.impl;

import org.springframework.stereotype.Service;
import xyz.apichiyu.project.entity.Authority;
import xyz.apichiyu.project.searchForm.AuthoritySearchForm;
import xyz.apichiyu.project.service.AuthorityService;

import java.util.List;
import java.util.Map;

@Service
public class AuthorityServiceImpl implements AuthorityService{

    @Override
    public boolean add(Authority object) {
        return false;
    }

    @Override
    public boolean addAll(List<Authority> list) {
        return false;
    }

    @Override
    public boolean delete(Authority object) {
        return false;
    }

    @Override
    public boolean deleteAll(List<Authority> list) {
        return false;
    }

    @Override
    public boolean deleteAll(AuthoritySearchForm form) {
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
    public boolean update(Authority object) {
        return false;
    }

    @Override
    public boolean updateAll(List<Authority> list) {
        return false;
    }

    @Override
    public boolean updateAll(Authority object, AuthoritySearchForm form) {
        return false;
    }

    @Override
    public boolean updateAll(Authority object, String searchMapJson) {
        return false;
    }

    @Override
    public boolean updateAll(Authority object, Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public Authority findById(String id) {
        return null;
    }

    @Override
    public Authority find(AuthoritySearchForm form) {
        return null;
    }

    @Override
    public Authority find(String searchMapJson) {
        return null;
    }

    @Override
    public Authority find(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public List<Authority> search(AuthoritySearchForm form) {
        return null;
    }

    @Override
    public List<Authority> search(String searchMapJson) {
        return null;
    }

    @Override
    public List<Authority> search(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public AuthoritySearchForm mapToForm(Map<String, Object> searchMap) {
        return null;
    }
}
