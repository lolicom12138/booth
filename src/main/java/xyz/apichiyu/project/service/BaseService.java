package xyz.apichiyu.project.service;

import xyz.apichiyu.project.entity.BaseEntity;
import xyz.apichiyu.project.searchForm.BaseSearchForm;

import java.util.List;
import java.util.Map;

public interface BaseService<T extends BaseEntity,U extends BaseSearchForm> {
    // C
    public boolean add(T object);
    public boolean addAll(List<T> list);
    // D
    public boolean delete(T object);
    public boolean deleteAll(List<T> list);
    public boolean deleteAll(U form);
    public boolean deleteAll(String searchMapJson);
    public boolean deleteAll(Map<String,Object> searchMap);
    // U
    public boolean update(T object);
    public boolean updateAll(List<T> list);
    public boolean updateAll(T object,U form);
    public boolean updateAll(T object,String searchMapJson);
    public boolean updateAll(T object, Map<String,Object> searchMap);
    // R
    public T findById(String id);
    public T find(U form);
    public T find(String searchMapJson);
    public T find(Map<String,Object> searchMap);
    public List<T> search(U form);
    public List<T> search(String searchMapJson);
    public List<T> search(Map<String,Object> searchMap);
    // other
    public U mapToForm(Map<String,Object> searchMap);
}
