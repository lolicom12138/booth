package xyz.apichiyu.project.controller.api.admin;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;
import xyz.apichiyu.project.dto.api.admin.AdminLoginDTO;
import xyz.apichiyu.project.entity.Admin;
import xyz.apichiyu.project.util.bean.Result;

@RestController
@RequestMapping("/api/admin/login")
@Api(value = "平台管理员登录接口",tags = "平台管理员")
public class AdminLoginApi {
    /**
     * 管理员使用用户名和密码登录接口
     *
     * @return
     */
    @ApiOperation("用户登录")
    @ApiImplicitParams({@ApiImplicitParam(name = "adminLoginDTO", required = true)})
    @PostMapping("/login")
    public Result login(@ApiParam(name="登陆信息DTO") @RequestBody AdminLoginDTO adminLoginDTO) {
        return null;
    }

    @ApiOperation("用户登出")
    @ApiImplicitParams({})
    @GetMapping("/logout")
    public Result logout(Admin admin) {
        return null;
    }
}
