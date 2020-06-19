package xyz.apichiyu.project.service.impl;

import org.springframework.stereotype.Service;
import xyz.apichiyu.project.entity.UserLoginRecord;
import xyz.apichiyu.project.searchForm.UserLoginRecordSearchForm;
import xyz.apichiyu.project.service.UserLoginRecordService;

import java.util.List;
import java.util.Map;

@Service
public class UserLoginRecordServiceImpl implements UserLoginRecordService{

    @Override
    public boolean add(UserLoginRecord object) {
        return false;
    }

    @Override
    public boolean addAll(List<UserLoginRecord> list) {
        return false;
    }

    @Override
    public boolean delete(UserLoginRecord object) {
        return false;
    }

    @Override
    public boolean deleteAll(List<UserLoginRecord> list) {
        return false;
    }

    @Override
    public boolean deleteAll(UserLoginRecordSearchForm form) {
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
    public boolean update(UserLoginRecord object) {
        return false;
    }

    @Override
    public boolean updateAll(List<UserLoginRecord> list) {
        return false;
    }

    @Override
    public boolean updateAll(UserLoginRecord object, UserLoginRecordSearchForm form) {
        return false;
    }

    @Override
    public boolean updateAll(UserLoginRecord object, String searchMapJson) {
        return false;
    }

    @Override
    public boolean updateAll(UserLoginRecord object, Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public UserLoginRecord findById(String id) {
        return null;
    }

    @Override
    public UserLoginRecord find(UserLoginRecordSearchForm form) {
        return null;
    }

    @Override
    public UserLoginRecord find(String searchMapJson) {
        return null;
    }

    @Override
    public UserLoginRecord find(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public List<UserLoginRecord> search(UserLoginRecordSearchForm form) {
        return null;
    }

    @Override
    public List<UserLoginRecord> search(String searchMapJson) {
        return null;
    }

    @Override
    public List<UserLoginRecord> search(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public UserLoginRecordSearchForm mapToForm(Map<String, Object> searchMap) {
        return null;
    }
}
