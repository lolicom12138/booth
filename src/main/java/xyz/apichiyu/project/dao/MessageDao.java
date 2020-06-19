package xyz.apichiyu.project.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.apichiyu.project.entity.Message;
import xyz.apichiyu.project.searchForm.MessageSearchForm;

@Mapper
public interface MessageDao extends BaseDao<Message, MessageSearchForm> {
}
