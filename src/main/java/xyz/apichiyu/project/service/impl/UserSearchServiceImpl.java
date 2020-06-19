package xyz.apichiyu.project.service.impl;

import org.springframework.stereotype.Service;
import xyz.apichiyu.project.entity.UserSearch;
import xyz.apichiyu.project.searchForm.UserSearchSearchForm;
import xyz.apichiyu.project.service.UserSearchService;

import java.util.List;
import java.util.Map;

@Service
public class UserSearchServiceImpl implements UserSearchService{

    @Override
    public boolean add(UserSearch object) {
        return false;
    }

    @Override
    public boolean addAll(List<UserSearch> list) {
        return false;
    }

    @Override
    public boolean delete(UserSearch object) {
        return false;
    }

    @Override
    public boolean deleteAll(List<UserSearch> list) {
        return false;
    }

    @Override
    public boolean deleteAll(UserSearchSearchForm form) {
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
    public boolean update(UserSearch object) {
        return false;
    }

    @Override
    public boolean updateAll(List<UserSearch> list) {
        return false;
    }

    @Override
    public boolean updateAll(UserSearch object, UserSearchSearchForm form) {
        return false;
    }

    @Override
    public boolean updateAll(UserSearch object, String searchMapJson) {
        return false;
    }

    @Override
    public boolean updateAll(UserSearch object, Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public UserSearch findById(String id) {
        return null;
    }

    @Override
    public UserSearch find(UserSearchSearchForm form) {
        return null;
    }

    @Override
    public UserSearch find(String searchMapJson) {
        return null;
    }

    @Override
    public UserSearch find(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public List<UserSearch> search(UserSearchSearchForm form) {
        return null;
    }

    @Override
    public List<UserSearch> search(String searchMapJson) {
        return null;
    }

    @Override
    public List<UserSearch> search(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public UserSearchSearchForm mapToForm(Map<String, Object> searchMap) {
        return null;
    }
}
