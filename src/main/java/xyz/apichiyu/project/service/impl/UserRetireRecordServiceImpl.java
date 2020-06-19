package xyz.apichiyu.project.service.impl;

import org.springframework.stereotype.Service;
import xyz.apichiyu.project.entity.UserRetireRecord;
import xyz.apichiyu.project.searchForm.UserRetireRecordSearchForm;
import xyz.apichiyu.project.service.UserRetireRecordService;

import java.util.List;
import java.util.Map;

@Service
public class UserRetireRecordServiceImpl implements UserRetireRecordService{

    @Override
    public boolean add(UserRetireRecord object) {
        return false;
    }

    @Override
    public boolean addAll(List<UserRetireRecord> list) {
        return false;
    }

    @Override
    public boolean delete(UserRetireRecord object) {
        return false;
    }

    @Override
    public boolean deleteAll(List<UserRetireRecord> list) {
        return false;
    }

    @Override
    public boolean deleteAll(UserRetireRecordSearchForm form) {
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
    public boolean update(UserRetireRecord object) {
        return false;
    }

    @Override
    public boolean updateAll(List<UserRetireRecord> list) {
        return false;
    }

    @Override
    public boolean updateAll(UserRetireRecord object, UserRetireRecordSearchForm form) {
        return false;
    }

    @Override
    public boolean updateAll(UserRetireRecord object, String searchMapJson) {
        return false;
    }

    @Override
    public boolean updateAll(UserRetireRecord object, Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public UserRetireRecord findById(String id) {
        return null;
    }

    @Override
    public UserRetireRecord find(UserRetireRecordSearchForm form) {
        return null;
    }

    @Override
    public UserRetireRecord find(String searchMapJson) {
        return null;
    }

    @Override
    public UserRetireRecord find(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public List<UserRetireRecord> search(UserRetireRecordSearchForm form) {
        return null;
    }

    @Override
    public List<UserRetireRecord> search(String searchMapJson) {
        return null;
    }

    @Override
    public List<UserRetireRecord> search(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public UserRetireRecordSearchForm mapToForm(Map<String, Object> searchMap) {
        return null;
    }
}
