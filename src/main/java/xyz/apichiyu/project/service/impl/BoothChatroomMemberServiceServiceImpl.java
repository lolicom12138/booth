package xyz.apichiyu.project.service.impl;

import org.springframework.stereotype.Service;
import xyz.apichiyu.project.entity.BoothChatroomMember;
import xyz.apichiyu.project.searchForm.BoothChatroomMemberSearchForm;
import xyz.apichiyu.project.service.BoothChatroomMemberService;

import java.util.List;
import java.util.Map;

@Service
public class BoothChatroomMemberServiceServiceImpl implements BoothChatroomMemberService{

    @Override
    public boolean add(BoothChatroomMember object) {
        return false;
    }

    @Override
    public boolean addAll(List<BoothChatroomMember> list) {
        return false;
    }

    @Override
    public boolean delete(BoothChatroomMember object) {
        return false;
    }

    @Override
    public boolean deleteAll(List<BoothChatroomMember> list) {
        return false;
    }

    @Override
    public boolean deleteAll(BoothChatroomMemberSearchForm form) {
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
    public boolean update(BoothChatroomMember object) {
        return false;
    }

    @Override
    public boolean updateAll(List<BoothChatroomMember> list) {
        return false;
    }

    @Override
    public boolean updateAll(BoothChatroomMember object, BoothChatroomMemberSearchForm form) {
        return false;
    }

    @Override
    public boolean updateAll(BoothChatroomMember object, String searchMapJson) {
        return false;
    }

    @Override
    public boolean updateAll(BoothChatroomMember object, Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public BoothChatroomMember findById(String id) {
        return null;
    }

    @Override
    public BoothChatroomMember find(BoothChatroomMemberSearchForm form) {
        return null;
    }

    @Override
    public BoothChatroomMember find(String searchMapJson) {
        return null;
    }

    @Override
    public BoothChatroomMember find(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public List<BoothChatroomMember> search(BoothChatroomMemberSearchForm form) {
        return null;
    }

    @Override
    public List<BoothChatroomMember> search(String searchMapJson) {
        return null;
    }

    @Override
    public List<BoothChatroomMember> search(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public BoothChatroomMemberSearchForm mapToForm(Map<String, Object> searchMap) {
        return null;
    }
}
