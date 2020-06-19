package xyz.apichiyu.project.service.impl;

import org.springframework.stereotype.Service;
import xyz.apichiyu.project.entity.BoothComment;
import xyz.apichiyu.project.searchForm.BoothCommentSearchForm;
import xyz.apichiyu.project.service.BoothCommentService;

import java.util.List;
import java.util.Map;

@Service
public class BoothCommentServiceImpl implements BoothCommentService{

    @Override
    public boolean add(BoothComment object) {
        return false;
    }

    @Override
    public boolean addAll(List<BoothComment> list) {
        return false;
    }

    @Override
    public boolean delete(BoothComment object) {
        return false;
    }

    @Override
    public boolean deleteAll(List<BoothComment> list) {
        return false;
    }

    @Override
    public boolean deleteAll(BoothCommentSearchForm form) {
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
    public boolean update(BoothComment object) {
        return false;
    }

    @Override
    public boolean updateAll(List<BoothComment> list) {
        return false;
    }

    @Override
    public boolean updateAll(BoothComment object, BoothCommentSearchForm form) {
        return false;
    }

    @Override
    public boolean updateAll(BoothComment object, String searchMapJson) {
        return false;
    }

    @Override
    public boolean updateAll(BoothComment object, Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public BoothComment findById(String id) {
        return null;
    }

    @Override
    public BoothComment find(BoothCommentSearchForm form) {
        return null;
    }

    @Override
    public BoothComment find(String searchMapJson) {
        return null;
    }

    @Override
    public BoothComment find(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public List<BoothComment> search(BoothCommentSearchForm form) {
        return null;
    }

    @Override
    public List<BoothComment> search(String searchMapJson) {
        return null;
    }

    @Override
    public List<BoothComment> search(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public BoothCommentSearchForm mapToForm(Map<String, Object> searchMap) {
        return null;
    }
}
