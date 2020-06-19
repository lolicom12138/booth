package xyz.apichiyu.project.service.impl;

import org.springframework.stereotype.Service;
import xyz.apichiyu.project.entity.UserTelCode;
import xyz.apichiyu.project.searchForm.UserTelCodeSearchForm;
import xyz.apichiyu.project.service.UserTelCodeService;

import java.util.List;
import java.util.Map;

@Service
public class UserTelCodeServiceImpl implements UserTelCodeService{

    @Override
    public boolean add(UserTelCode object) {
        return false;
    }

    @Override
    public boolean addAll(List<UserTelCode> list) {
        return false;
    }

    @Override
    public boolean delete(UserTelCode object) {
        return false;
    }

    @Override
    public boolean deleteAll(List<UserTelCode> list) {
        return false;
    }

    @Override
    public boolean deleteAll(UserTelCodeSearchForm form) {
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
    public boolean update(UserTelCode object) {
        return false;
    }

    @Override
    public boolean updateAll(List<UserTelCode> list) {
        return false;
    }

    @Override
    public boolean updateAll(UserTelCode object, UserTelCodeSearchForm form) {
        return false;
    }

    @Override
    public boolean updateAll(UserTelCode object, String searchMapJson) {
        return false;
    }

    @Override
    public boolean updateAll(UserTelCode object, Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public UserTelCode findById(String id) {
        return null;
    }

    @Override
    public UserTelCode find(UserTelCodeSearchForm form) {
        return null;
    }

    @Override
    public UserTelCode find(String searchMapJson) {
        return null;
    }

    @Override
    public UserTelCode find(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public List<UserTelCode> search(UserTelCodeSearchForm form) {
        return null;
    }

    @Override
    public List<UserTelCode> search(String searchMapJson) {
        return null;
    }

    @Override
    public List<UserTelCode> search(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public UserTelCodeSearchForm mapToForm(Map<String, Object> searchMap) {
        return null;
    }
}
