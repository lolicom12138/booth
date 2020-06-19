package xyz.apichiyu.project.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.apichiyu.project.entity.WechatLogin;
import xyz.apichiyu.project.searchForm.WechatLoginSearchForm;

@Mapper
public interface WechatLoginDao extends BaseDao<WechatLogin, WechatLoginSearchForm> {
}
