package xyz.apichiyu.project.service.impl;

import org.springframework.stereotype.Service;
import xyz.apichiyu.project.entity.BoothCommentReply;
import xyz.apichiyu.project.searchForm.BoothCommentReplySearchForm;
import xyz.apichiyu.project.service.BoothCommentReplyService;

import java.util.List;
import java.util.Map;

@Service
public class BoothCommentReplyServiceImpl implements BoothCommentReplyService{

    @Override
    public boolean add(BoothCommentReply object) {
        return false;
    }

    @Override
    public boolean addAll(List<BoothCommentReply> list) {
        return false;
    }

    @Override
    public boolean delete(BoothCommentReply object) {
        return false;
    }

    @Override
    public boolean deleteAll(List<BoothCommentReply> list) {
        return false;
    }

    @Override
    public boolean deleteAll(BoothCommentReplySearchForm form) {
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
    public boolean update(BoothCommentReply object) {
        return false;
    }

    @Override
    public boolean updateAll(List<BoothCommentReply> list) {
        return false;
    }

    @Override
    public boolean updateAll(BoothCommentReply object, BoothCommentReplySearchForm form) {
        return false;
    }

    @Override
    public boolean updateAll(BoothCommentReply object, String searchMapJson) {
        return false;
    }

    @Override
    public boolean updateAll(BoothCommentReply object, Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public BoothCommentReply findById(String id) {
        return null;
    }

    @Override
    public BoothCommentReply find(BoothCommentReplySearchForm form) {
        return null;
    }

    @Override
    public BoothCommentReply find(String searchMapJson) {
        return null;
    }

    @Override
    public BoothCommentReply find(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public List<BoothCommentReply> search(BoothCommentReplySearchForm form) {
        return null;
    }

    @Override
    public List<BoothCommentReply> search(String searchMapJson) {
        return null;
    }

    @Override
    public List<BoothCommentReply> search(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public BoothCommentReplySearchForm mapToForm(Map<String, Object> searchMap) {
        return null;
    }
}
