package xyz.apichiyu.project.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.apichiyu.project.entity.BlacklistWord;
import xyz.apichiyu.project.searchForm.BlacklistWordSearchForm;

@Mapper
public interface BlacklistWordDao extends BaseDao<BlacklistWord, BlacklistWordSearchForm> {
}
