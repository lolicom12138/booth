package xyz.apichiyu.project.service.impl;

import org.springframework.stereotype.Service;
import xyz.apichiyu.project.entity.BoothChatroom;
import xyz.apichiyu.project.searchForm.BoothChatroomSearchForm;
import xyz.apichiyu.project.service.BoothChatroomService;

import java.util.List;
import java.util.Map;

@Service
public class BoothChatroomServiceImpl implements BoothChatroomService{

    @Override
    public boolean add(BoothChatroom object) {
        return false;
    }

    @Override
    public boolean addAll(List<BoothChatroom> list) {
        return false;
    }

    @Override
    public boolean delete(BoothChatroom object) {
        return false;
    }

    @Override
    public boolean deleteAll(List<BoothChatroom> list) {
        return false;
    }

    @Override
    public boolean deleteAll(BoothChatroomSearchForm form) {
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
    public boolean update(BoothChatroom object) {
        return false;
    }

    @Override
    public boolean updateAll(List<BoothChatroom> list) {
        return false;
    }

    @Override
    public boolean updateAll(BoothChatroom object, BoothChatroomSearchForm form) {
        return false;
    }

    @Override
    public boolean updateAll(BoothChatroom object, String searchMapJson) {
        return false;
    }

    @Override
    public boolean updateAll(BoothChatroom object, Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public BoothChatroom findById(String id) {
        return null;
    }

    @Override
    public BoothChatroom find(BoothChatroomSearchForm form) {
        return null;
    }

    @Override
    public BoothChatroom find(String searchMapJson) {
        return null;
    }

    @Override
    public BoothChatroom find(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public List<BoothChatroom> search(BoothChatroomSearchForm form) {
        return null;
    }

    @Override
    public List<BoothChatroom> search(String searchMapJson) {
        return null;
    }

    @Override
    public List<BoothChatroom> search(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public BoothChatroomSearchForm mapToForm(Map<String, Object> searchMap) {
        return null;
    }
}
