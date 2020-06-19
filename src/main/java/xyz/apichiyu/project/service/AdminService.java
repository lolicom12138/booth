package xyz.apichiyu.project.service;

import xyz.apichiyu.project.entity.Admin;
import xyz.apichiyu.project.searchForm.AdminSearchForm;

public interface AdminService extends BaseService<Admin, AdminSearchForm> {
    public Admin checkLogin(String sessionId,String nonceStr,String sign);
    public Admin login(String login,String pwd);
    public boolean logout();
}
