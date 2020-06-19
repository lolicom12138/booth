package xyz.apichiyu.project.service.impl;

import org.springframework.stereotype.Service;
import xyz.apichiyu.project.entity.Tag;
import xyz.apichiyu.project.searchForm.TagSearchForm;
import xyz.apichiyu.project.service.TagService;

import java.util.List;
import java.util.Map;

@Service
public class TagServiceImpl implements TagService{

    @Override
    public boolean add(Tag object) {
        return false;
    }

    @Override
    public boolean addAll(List<Tag> list) {
        return false;
    }

    @Override
    public boolean delete(Tag object) {
        return false;
    }

    @Override
    public boolean deleteAll(List<Tag> list) {
        return false;
    }

    @Override
    public boolean deleteAll(TagSearchForm form) {
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
    public boolean update(Tag object) {
        return false;
    }

    @Override
    public boolean updateAll(List<Tag> list) {
        return false;
    }

    @Override
    public boolean updateAll(Tag object, TagSearchForm form) {
        return false;
    }

    @Override
    public boolean updateAll(Tag object, String searchMapJson) {
        return false;
    }

    @Override
    public boolean updateAll(Tag object, Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public Tag findById(String id) {
        return null;
    }

    @Override
    public Tag find(TagSearchForm form) {
        return null;
    }

    @Override
    public Tag find(String searchMapJson) {
        return null;
    }

    @Override
    public Tag find(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public List<Tag> search(TagSearchForm form) {
        return null;
    }

    @Override
    public List<Tag> search(String searchMapJson) {
        return null;
    }

    @Override
    public List<Tag> search(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public TagSearchForm mapToForm(Map<String, Object> searchMap) {
        return null;
    }
}
