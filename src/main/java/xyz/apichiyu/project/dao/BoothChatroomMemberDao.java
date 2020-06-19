package xyz.apichiyu.project.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.apichiyu.project.entity.BoothChatroomMember;
import xyz.apichiyu.project.searchForm.BoothChatroomMemberSearchForm;

@Mapper
public interface BoothChatroomMemberDao extends BaseDao<BoothChatroomMember, BoothChatroomMemberSearchForm> {
}
