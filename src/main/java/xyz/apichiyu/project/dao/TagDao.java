package xyz.apichiyu.project.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.apichiyu.project.entity.Tag;
import xyz.apichiyu.project.searchForm.TagSearchForm;

@Mapper
public interface TagDao extends BaseDao<Tag, TagSearchForm> {
}
