package xyz.apichiyu.project.controller.api.admin;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import xyz.apichiyu.project.dto.api.admin.AdminDTO;
import xyz.apichiyu.project.entity.Admin;
import xyz.apichiyu.project.searchForm.AdminSearchForm;
import xyz.apichiyu.project.util.bean.Result;

/**
 * 对于管理员的增删改查
 *
 * @author 李源
 */
@RestController
@RequestMapping("/api/admin/admin")
@Api(value = "平台管理员管理接口", tags = "平台管理员")
public class AdminApi {
    @ApiOperation("添加管理员")
    @ApiImplicitParams({@ApiImplicitParam(paramType = "body", dataType = "AddAdminDTO", value = "管理员信息", name = "dto", required = true)})
    @PostMapping("/add")
    public Result addAdmin(@RequestBody AdminDTO dto, Admin admin) {
        return null;
    }

    @PostMapping("/update")
    @ApiOperation("修改管理员")
    @ApiImplicitParams({@ApiImplicitParam(paramType = "body", dataType = "AdminDTO", value = "管理员信息", name = "dto", required = true)})
    public Result updateAdmin(@RequestBody AdminDTO dto, Admin admin) {
        return null;
    }

    @ApiOperation("删除管理员")
    @ApiImplicitParams({@ApiImplicitParam(paramType = "get", dataType = "string", value = "管理员id", name = "adminId", required = true)})
    @PostMapping("/delete/{id}")
    public Result deleteAdmin(@PathVariable(value = "id",required = true)  String adminId, Admin admin) {
        return null;
    }

    @ApiOperation("管理员检索")
    @ApiImplicitParams({@ApiImplicitParam(paramType = "body", dataType = "AdminSearchForm", value = "管理员检索对象", name = "form", required = true)})
    @PostMapping("/list")
    public Result listAdmin(@RequestBody AdminSearchForm form, Admin admin) {
        return null;
    }

    @ApiOperation("管理员信息")
    @ApiImplicitParams({@ApiImplicitParam(paramType = "get", dataType = "string", value = "管理员id", name = "adminId", required = true)})
    @PostMapping("/detail/{id}")
    public Result detailAdmin(@PathVariable(value = "id",required = true)  String adminId, Admin admin) {
        return null;
    }
}
