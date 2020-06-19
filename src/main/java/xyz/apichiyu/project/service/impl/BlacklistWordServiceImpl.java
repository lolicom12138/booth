package xyz.apichiyu.project.service.impl;

import org.springframework.stereotype.Service;
import xyz.apichiyu.project.entity.BlacklistWord;
import xyz.apichiyu.project.searchForm.BlacklistWordSearchForm;
import xyz.apichiyu.project.service.BlacklistWordService;

import java.util.List;
import java.util.Map;

@Service
public class BlacklistWordServiceImpl implements BlacklistWordService{

    @Override
    public boolean add(BlacklistWord object) {
        return false;
    }

    @Override
    public boolean addAll(List<BlacklistWord> list) {
        return false;
    }

    @Override
    public boolean delete(BlacklistWord object) {
        return false;
    }

    @Override
    public boolean deleteAll(List<BlacklistWord> list) {
        return false;
    }

    @Override
    public boolean deleteAll(BlacklistWordSearchForm form) {
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
    public boolean update(BlacklistWord object) {
        return false;
    }

    @Override
    public boolean updateAll(List<BlacklistWord> list) {
        return false;
    }

    @Override
    public boolean updateAll(BlacklistWord object, BlacklistWordSearchForm form) {
        return false;
    }

    @Override
    public boolean updateAll(BlacklistWord object, String searchMapJson) {
        return false;
    }

    @Override
    public boolean updateAll(BlacklistWord object, Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public BlacklistWord findById(String id) {
        return null;
    }

    @Override
    public BlacklistWord find(BlacklistWordSearchForm form) {
        return null;
    }

    @Override
    public BlacklistWord find(String searchMapJson) {
        return null;
    }

    @Override
    public BlacklistWord find(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public List<BlacklistWord> search(BlacklistWordSearchForm form) {
        return null;
    }

    @Override
    public List<BlacklistWord> search(String searchMapJson) {
        return null;
    }

    @Override
    public List<BlacklistWord> search(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public BlacklistWordSearchForm mapToForm(Map<String, Object> searchMap) {
        return null;
    }
}
