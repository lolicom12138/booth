package xyz.apichiyu.project.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.apichiyu.project.entity.FileStorage;
import xyz.apichiyu.project.searchForm.FileStorageSearchForm;

@Mapper
public interface FileStorageDao extends BaseDao<FileStorage, FileStorageSearchForm> {
}
