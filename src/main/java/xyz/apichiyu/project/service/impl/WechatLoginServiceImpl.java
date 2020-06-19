package xyz.apichiyu.project.service.impl;

import org.springframework.stereotype.Service;
import xyz.apichiyu.project.entity.WechatLogin;
import xyz.apichiyu.project.searchForm.WechatLoginSearchForm;
import xyz.apichiyu.project.service.WechatLoginService;

import java.util.List;
import java.util.Map;

@Service
public class WechatLoginServiceImpl implements WechatLoginService{

    @Override
    public boolean add(WechatLogin object) {
        return false;
    }

    @Override
    public boolean addAll(List<WechatLogin> list) {
        return false;
    }

    @Override
    public boolean delete(WechatLogin object) {
        return false;
    }

    @Override
    public boolean deleteAll(List<WechatLogin> list) {
        return false;
    }

    @Override
    public boolean deleteAll(WechatLoginSearchForm form) {
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
    public boolean update(WechatLogin object) {
        return false;
    }

    @Override
    public boolean updateAll(List<WechatLogin> list) {
        return false;
    }

    @Override
    public boolean updateAll(WechatLogin object, WechatLoginSearchForm form) {
        return false;
    }

    @Override
    public boolean updateAll(WechatLogin object, String searchMapJson) {
        return false;
    }

    @Override
    public boolean updateAll(WechatLogin object, Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public WechatLogin findById(String id) {
        return null;
    }

    @Override
    public WechatLogin find(WechatLoginSearchForm form) {
        return null;
    }

    @Override
    public WechatLogin find(String searchMapJson) {
        return null;
    }

    @Override
    public WechatLogin find(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public List<WechatLogin> search(WechatLoginSearchForm form) {
        return null;
    }

    @Override
    public List<WechatLogin> search(String searchMapJson) {
        return null;
    }

    @Override
    public List<WechatLogin> search(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public WechatLoginSearchForm mapToForm(Map<String, Object> searchMap) {
        return null;
    }
}
