package xyz.apichiyu.project.service.impl;

import org.springframework.stereotype.Service;
import xyz.apichiyu.project.entity.Message;
import xyz.apichiyu.project.searchForm.MessageSearchForm;
import xyz.apichiyu.project.service.MessageService;

import java.util.List;
import java.util.Map;

@Service
public class MessageServiceImpl implements MessageService{

    @Override
    public boolean add(Message object) {
        return false;
    }

    @Override
    public boolean addAll(List<Message> list) {
        return false;
    }

    @Override
    public boolean delete(Message object) {
        return false;
    }

    @Override
    public boolean deleteAll(List<Message> list) {
        return false;
    }

    @Override
    public boolean deleteAll(MessageSearchForm form) {
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
    public boolean update(Message object) {
        return false;
    }

    @Override
    public boolean updateAll(List<Message> list) {
        return false;
    }

    @Override
    public boolean updateAll(Message object, MessageSearchForm form) {
        return false;
    }

    @Override
    public boolean updateAll(Message object, String searchMapJson) {
        return false;
    }

    @Override
    public boolean updateAll(Message object, Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public Message findById(String id) {
        return null;
    }

    @Override
    public Message find(MessageSearchForm form) {
        return null;
    }

    @Override
    public Message find(String searchMapJson) {
        return null;
    }

    @Override
    public Message find(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public List<Message> search(MessageSearchForm form) {
        return null;
    }

    @Override
    public List<Message> search(String searchMapJson) {
        return null;
    }

    @Override
    public List<Message> search(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public MessageSearchForm mapToForm(Map<String, Object> searchMap) {
        return null;
    }
}
