package xyz.apichiyu.project.controller.api.admin;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import xyz.apichiyu.project.dto.api.admin.AdminAuthorityDTO;
import xyz.apichiyu.project.entity.Admin;
import xyz.apichiyu.project.util.bean.Result;

/**
 * 对于管理员权限的设定
 * @author 李源
 */
@RestController
@Api(value = "平台管理员权限设定接口", tags = "平台管理员")
@RequestMapping("/api/admin/authority")
public class AdminAuthorityApi {
    /**
     * 权限列表，此处应该返回所有权限类型为平台的权限，摊位的权限此处不涉及。权限的增删改不在这里设定，由数据库直接控制
     * @return
     */
    @ApiOperation("所有权限列表")
    @ApiImplicitParams({})
    @GetMapping("/list")
    public Result list(){
        return null;
    }

    /**
     * 设定管理员权限
     * @param dto
     * @param admin
     * @return
     */
    @ApiOperation("为管理员设置权限")
    @ApiImplicitParams({@ApiImplicitParam(paramType = "body", dataType = "AdminAuthorityDTO", value = "管理员权限dto", name = "dto", required = true)})
    @PostMapping("/setAdminAuthority")
    public Result setAdminAuthority(@RequestBody AdminAuthorityDTO dto, Admin admin){
        return null;
    }
}
