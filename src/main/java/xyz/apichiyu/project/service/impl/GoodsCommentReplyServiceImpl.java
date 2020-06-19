package xyz.apichiyu.project.service.impl;

import org.springframework.stereotype.Service;
import xyz.apichiyu.project.entity.GoodsCommentReply;
import xyz.apichiyu.project.searchForm.GoodsCommentReplySearchForm;
import xyz.apichiyu.project.service.GoodsCommentReplyService;

import java.util.List;
import java.util.Map;

@Service
public class GoodsCommentReplyServiceImpl implements GoodsCommentReplyService{

    @Override
    public boolean add(GoodsCommentReply object) {
        return false;
    }

    @Override
    public boolean addAll(List<GoodsCommentReply> list) {
        return false;
    }

    @Override
    public boolean delete(GoodsCommentReply object) {
        return false;
    }

    @Override
    public boolean deleteAll(List<GoodsCommentReply> list) {
        return false;
    }

    @Override
    public boolean deleteAll(GoodsCommentReplySearchForm form) {
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
    public boolean update(GoodsCommentReply object) {
        return false;
    }

    @Override
    public boolean updateAll(List<GoodsCommentReply> list) {
        return false;
    }

    @Override
    public boolean updateAll(GoodsCommentReply object, GoodsCommentReplySearchForm form) {
        return false;
    }

    @Override
    public boolean updateAll(GoodsCommentReply object, String searchMapJson) {
        return false;
    }

    @Override
    public boolean updateAll(GoodsCommentReply object, Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public GoodsCommentReply findById(String id) {
        return null;
    }

    @Override
    public GoodsCommentReply find(GoodsCommentReplySearchForm form) {
        return null;
    }

    @Override
    public GoodsCommentReply find(String searchMapJson) {
        return null;
    }

    @Override
    public GoodsCommentReply find(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public List<GoodsCommentReply> search(GoodsCommentReplySearchForm form) {
        return null;
    }

    @Override
    public List<GoodsCommentReply> search(String searchMapJson) {
        return null;
    }

    @Override
    public List<GoodsCommentReply> search(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public GoodsCommentReplySearchForm mapToForm(Map<String, Object> searchMap) {
        return null;
    }
}
