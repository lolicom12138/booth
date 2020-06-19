package xyz.apichiyu.project.controller.api.admin;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.apichiyu.project.dto.api.admin.SettingDTO;
import xyz.apichiyu.project.entity.Admin;
import xyz.apichiyu.project.util.bean.Result;

@RestController
@Api(value = "系统配置", tags = "管理系统配置")
@RequestMapping("/api/admin/setting")
public class AdminSettingApi {
    @RequestMapping("/listSetting")
    public Result listSetting(Admin admin){
        return null;
    }
    @RequestMapping("/set")
    public Result set(@RequestBody SettingDTO settingDTO, Admin admin){
        return null;
    }

}
