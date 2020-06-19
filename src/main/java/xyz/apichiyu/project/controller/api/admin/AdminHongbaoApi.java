package xyz.apichiyu.project.controller.api.admin;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import xyz.apichiyu.project.dto.api.admin.HongbaoDTO;
import xyz.apichiyu.project.entity.Admin;
import xyz.apichiyu.project.entity.Hongbao;
import xyz.apichiyu.project.searchForm.HongbaoSearchForm;
import xyz.apichiyu.project.util.bean.Result;

@RestController
@RequestMapping("/api/admin/hongbao")
@Api(value = "红包", tags = "管理红包")
public class AdminHongbaoApi {
    @ApiOperation("添加红包")
    @ApiImplicitParams({@ApiImplicitParam(paramType = "body", dataType = "HongbaoDTO", value = "红包信息", name = "dto", required = true)})
    @PostMapping("/add")
    public Result addHongbao(@RequestBody HongbaoDTO dto, Admin admin) {
        return null;
    }

    @ApiOperation("修改红包")
    @ApiImplicitParams({@ApiImplicitParam(paramType = "body", dataType = "HongbaoDTO", value = "红包信息", name = "dto", required = true)})
    @PostMapping("/update")
    public Result updateHongbao(@RequestBody HongbaoDTO dto, Admin admin) {
        return null;
    }

    @ApiOperation("删除红包")
    @ApiImplicitParams({@ApiImplicitParam(paramType = "get", dataType = "string", value = "红包信息", name = "hongbaoId", required = true)})
    @PostMapping("/delete/{id}")
    public Result deleteHongbao(@PathVariable(value = "id",required = true)  String hongbaoId, Admin admin) {
        return null;
    }

    @ApiOperation("红包检索")
    @ApiImplicitParams({@ApiImplicitParam(paramType = "body", dataType = "HongbaoSearchForm", value = "红包检索", name = "form", required = true)})
    @PostMapping("/list")
    public Result listHongbao(@RequestBody HongbaoSearchForm form, Admin admin) {
        return null;
    }

    @ApiOperation("红包详情")
    @ApiImplicitParams({@ApiImplicitParam(paramType = "get", dataType = "string", value = "红包id", name = "hongbaoId", required = true)})
    @GetMapping("/detail/{id}")
    public Result detailHongbao(@PathVariable(value = "id",required = true) String hongbaoId, Admin admin) {
        return null;
    }
}
