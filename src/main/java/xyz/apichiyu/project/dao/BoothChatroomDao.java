package xyz.apichiyu.project.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.apichiyu.project.entity.BoothChatroom;
import xyz.apichiyu.project.searchForm.BoothChatroomSearchForm;

@Mapper
public interface BoothChatroomDao extends BaseDao<BoothChatroom, BoothChatroomSearchForm> {
}
