package xyz.apichiyu.project.service.impl;

import org.springframework.stereotype.Service;
import xyz.apichiyu.project.entity.UserMoneyRecord;
import xyz.apichiyu.project.searchForm.UserMoneyRecordSearchForm;
import xyz.apichiyu.project.service.UserMoneyRecordService;

import java.util.List;
import java.util.Map;

@Service
public class UserMoneyRecordServiceImpl implements UserMoneyRecordService{

    @Override
    public boolean add(UserMoneyRecord object) {
        return false;
    }

    @Override
    public boolean addAll(List<UserMoneyRecord> list) {
        return false;
    }

    @Override
    public boolean delete(UserMoneyRecord object) {
        return false;
    }

    @Override
    public boolean deleteAll(List<UserMoneyRecord> list) {
        return false;
    }

    @Override
    public boolean deleteAll(UserMoneyRecordSearchForm form) {
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
    public boolean update(UserMoneyRecord object) {
        return false;
    }

    @Override
    public boolean updateAll(List<UserMoneyRecord> list) {
        return false;
    }

    @Override
    public boolean updateAll(UserMoneyRecord object, UserMoneyRecordSearchForm form) {
        return false;
    }

    @Override
    public boolean updateAll(UserMoneyRecord object, String searchMapJson) {
        return false;
    }

    @Override
    public boolean updateAll(UserMoneyRecord object, Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public UserMoneyRecord findById(String id) {
        return null;
    }

    @Override
    public UserMoneyRecord find(UserMoneyRecordSearchForm form) {
        return null;
    }

    @Override
    public UserMoneyRecord find(String searchMapJson) {
        return null;
    }

    @Override
    public UserMoneyRecord find(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public List<UserMoneyRecord> search(UserMoneyRecordSearchForm form) {
        return null;
    }

    @Override
    public List<UserMoneyRecord> search(String searchMapJson) {
        return null;
    }

    @Override
    public List<UserMoneyRecord> search(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public UserMoneyRecordSearchForm mapToForm(Map<String, Object> searchMap) {
        return null;
    }
}
