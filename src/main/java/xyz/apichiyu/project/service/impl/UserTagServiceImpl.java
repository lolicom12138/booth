package xyz.apichiyu.project.service.impl;

import org.springframework.stereotype.Service;
import xyz.apichiyu.project.entity.UserTag;
import xyz.apichiyu.project.searchForm.UserTagSearchForm;
import xyz.apichiyu.project.service.UserTagService;

import java.util.List;
import java.util.Map;

@Service
public class UserTagServiceImpl implements UserTagService{

    @Override
    public boolean add(UserTag object) {
        return false;
    }

    @Override
    public boolean addAll(List<UserTag> list) {
        return false;
    }

    @Override
    public boolean delete(UserTag object) {
        return false;
    }

    @Override
    public boolean deleteAll(List<UserTag> list) {
        return false;
    }

    @Override
    public boolean deleteAll(UserTagSearchForm form) {
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
    public boolean update(UserTag object) {
        return false;
    }

    @Override
    public boolean updateAll(List<UserTag> list) {
        return false;
    }

    @Override
    public boolean updateAll(UserTag object, UserTagSearchForm form) {
        return false;
    }

    @Override
    public boolean updateAll(UserTag object, String searchMapJson) {
        return false;
    }

    @Override
    public boolean updateAll(UserTag object, Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public UserTag findById(String id) {
        return null;
    }

    @Override
    public UserTag find(UserTagSearchForm form) {
        return null;
    }

    @Override
    public UserTag find(String searchMapJson) {
        return null;
    }

    @Override
    public UserTag find(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public List<UserTag> search(UserTagSearchForm form) {
        return null;
    }

    @Override
    public List<UserTag> search(String searchMapJson) {
        return null;
    }

    @Override
    public List<UserTag> search(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public UserTagSearchForm mapToForm(Map<String, Object> searchMap) {
        return null;
    }
}
