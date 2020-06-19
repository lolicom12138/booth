package xyz.apichiyu.project.dao;
import org.apache.ibatis.annotations.Param;
import xyz.apichiyu.project.entity.BaseEntity;
import xyz.apichiyu.project.searchForm.BaseSearchForm;

import java.util.List;

public interface BaseDao<T extends BaseEntity,U extends BaseSearchForm> {
    public int add(T object);
    public int addAll(List<T> list);
    public T findById(String id);
    public T findByForm(U form);
    public List<T> searchByForm(U form);
    public int update(T object);
    public int updateAll(@Param("object") T object, @Param("form") U form);
    public int delete(T object);
    public int deleteAll(U form);
}
