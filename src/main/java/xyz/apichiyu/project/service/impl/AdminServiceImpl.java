package xyz.apichiyu.project.service.impl;

import org.springframework.stereotype.Service;
import xyz.apichiyu.project.entity.Admin;
import xyz.apichiyu.project.searchForm.AdminSearchForm;
import xyz.apichiyu.project.service.AdminService;

import java.util.List;
import java.util.Map;

@Service
public class AdminServiceImpl implements AdminService{

    @Override
    public boolean add(Admin object) {
        return false;
    }

    @Override
    public boolean addAll(List<Admin> list) {
        return false;
    }

    @Override
    public boolean delete(Admin object) {
        return false;
    }

    @Override
    public boolean deleteAll(List<Admin> list) {
        return false;
    }

    @Override
    public boolean deleteAll(AdminSearchForm form) {
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
    public boolean update(Admin object) {
        return false;
    }

    @Override
    public boolean updateAll(List<Admin> list) {
        return false;
    }

    @Override
    public boolean updateAll(Admin object, AdminSearchForm form) {
        return false;
    }

    @Override
    public boolean updateAll(Admin object, String searchMapJson) {
        return false;
    }

    @Override
    public boolean updateAll(Admin object, Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public Admin findById(String id) {
        return null;
    }

    @Override
    public Admin find(AdminSearchForm form) {
        return null;
    }

    @Override
    public Admin find(String searchMapJson) {
        return null;
    }

    @Override
    public Admin find(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public List<Admin> search(AdminSearchForm form) {
        return null;
    }

    @Override
    public List<Admin> search(String searchMapJson) {
        return null;
    }

    @Override
    public List<Admin> search(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public AdminSearchForm mapToForm(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public Admin checkLogin(String sessionId, String nonceStr, String sign) {
        return null;
    }

    @Override
    public Admin login(String login, String pwd) {
        return null;
    }

    @Override
    public boolean logout() {
        return false;
    }
}
