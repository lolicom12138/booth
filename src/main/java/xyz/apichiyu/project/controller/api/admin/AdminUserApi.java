package xyz.apichiyu.project.controller.api.admin;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.apichiyu.project.entity.Admin;
import xyz.apichiyu.project.entity.User;
import xyz.apichiyu.project.searchForm.UserLoginRecordSearchForm;
import xyz.apichiyu.project.searchForm.UserMoneyRecordSearchForm;
import xyz.apichiyu.project.searchForm.UserRetireRecordSearchForm;
import xyz.apichiyu.project.searchForm.UserSearchForm;
import xyz.apichiyu.project.util.bean.Result;

@RestController
@Api(value = "用户信息", tags = "管理用户相关")
@RequestMapping("/api/admin/user")
public class AdminUserApi {
    @RequestMapping("/list")
    public Result listUser(@RequestBody UserSearchForm form, Admin admin) {
        return null;
    }

    @RequestMapping("/detail")
    public Result detailUser(@RequestBody String userId, Admin admin) {
        return null;
    }

    @RequestMapping("/listRetireRecord")
    public Result listRetireRecord(@RequestBody UserRetireRecordSearchForm form, Admin admin) {
        return null;
    }

    @RequestMapping("/listLoginRecord")
    public Result listLoginRecord(@RequestBody UserLoginRecordSearchForm form, Admin admin) {
        return null;
    }

    @RequestMapping("/listMoneyRecord")
    public Result listMoneyRecord(@RequestBody UserMoneyRecordSearchForm form, Admin admin) {
        return null;
    }


}
