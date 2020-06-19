package xyz.apichiyu.project.service.impl;

import org.springframework.stereotype.Service;
import xyz.apichiyu.project.entity.User;
import xyz.apichiyu.project.searchForm.UserSearchForm;
import xyz.apichiyu.project.service.UserService;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService{

    @Override
    public boolean add(User object) {
        return false;
    }

    @Override
    public boolean addAll(List<User> list) {
        return false;
    }

    @Override
    public boolean delete(User object) {
        return false;
    }

    @Override
    public boolean deleteAll(List<User> list) {
        return false;
    }

    @Override
    public boolean deleteAll(UserSearchForm form) {
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
    public boolean update(User object) {
        return false;
    }

    @Override
    public boolean updateAll(List<User> list) {
        return false;
    }

    @Override
    public boolean updateAll(User object, UserSearchForm form) {
        return false;
    }

    @Override
    public boolean updateAll(User object, String searchMapJson) {
        return false;
    }

    @Override
    public boolean updateAll(User object, Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public User findById(String id) {
        return null;
    }

    @Override
    public User find(UserSearchForm form) {
        return null;
    }

    @Override
    public User find(String searchMapJson) {
        return null;
    }

    @Override
    public User find(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public List<User> search(UserSearchForm form) {
        return null;
    }

    @Override
    public List<User> search(String searchMapJson) {
        return null;
    }

    @Override
    public List<User> search(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public UserSearchForm mapToForm(Map<String, Object> searchMap) {
        return null;
    }
}
