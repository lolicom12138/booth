package xyz.apichiyu.project.controller.api.admin;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;
import xyz.apichiyu.project.dto.api.admin.ApplyRefuseDTO;
import xyz.apichiyu.project.dto.api.admin.BoothPopularDTO;
import xyz.apichiyu.project.dto.api.admin.BoothTagDTO;
import xyz.apichiyu.project.dto.api.admin.GoodsPopularDTO;
import xyz.apichiyu.project.entity.Admin;
import xyz.apichiyu.project.entity.Booth;
import xyz.apichiyu.project.entity.BoothPopular;
import xyz.apichiyu.project.entity.GoodsPopular;
import xyz.apichiyu.project.searchForm.*;
import xyz.apichiyu.project.util.bean.Result;

@RestController
@Api(value = "摊位", tags = "管理摊位")
@RequestMapping("/api/admin/booth")
public class AdminBoothApi {
    /**
     * 修改除boolean以外的内容
     *
     * @param booth
     * @return
     */
    @PostMapping("/update")
    public Result updateBooth(@RequestBody Booth booth, Admin admin) {
        return null;
    }

    @PostMapping("/list")
    public Result listBooth(@RequestBody BoothSearchForm form,Admin admin) {
        return null;
    }

    @GetMapping("/detail/{id}")
    public Result detailBooth(@PathVariable(value="id",required = true) String boothId,Admin admin) {
        return null;
    }

    @GetMapping("/changeStatus/{id}")
    public Result changeStatus(@PathVariable(value="id",required = true) String boothId,Admin admin) {
        return null;
    }

    @PostMapping("/listApply")
    public Result listApply(@RequestBody BoothApplySearchForm form,Admin admin) {
        return null;
    }

    @GetMapping("/detailApply/{id}")
    public Result detailApply(@PathVariable(value="id",required = true) String boothId,Admin admin) {
        return null;
    }

    @GetMapping("/doneApply/{id}")
    public Result doneApply(@PathVariable(value="id",required = true) String boothId,Admin admin) {
        return null;
    }

    @PostMapping("/refuseApply")
    public Result refuseApply(@RequestBody ApplyRefuseDTO applyRefuseDTO,Admin admin) {
        return null;
    }

    @PostMapping("/listMoneyRecord")
    public Result listMoneyRecord(@RequestBody BoothMoneyRecordSearchForm form,Admin admin) {
        return null;
    }

    @PostMapping("/addBoothPopular")
    public Result addBoothPopular(@RequestBody BoothPopularDTO boothPopularDTO,Admin admin) {
        return null;
    }

    @GetMapping("/deleteBoothPopular/{id}")
    public Result deleteBoothPopular(@PathVariable(value="id",required = true) String popularId,Admin admin) {
        return null;
    }

    @PostMapping("/listBoothPopular")
    public Result listBoothPopular(@RequestBody BoothPopularSearchForm form,Admin admin) {
        return null;
    }

    @GetMapping("/detailBoothPopular/{id}")
    public Result detailBoothPopular(@PathVariable(value="id",required = true) String popularId,Admin admin) {
        return null;
    }

    @PostMapping("/updateBoothPopular")
    public Result updateBoothPopular(@RequestBody BoothPopular boothPopular,Admin admin) {
        return null;
    }

    @PostMapping("/addGoodsPopular")
    public Result addGoodsPopular(@RequestBody GoodsPopularDTO goodsPopularDTO,Admin admin) {
        return null;
    }

    @GetMapping("/deleteGoodsPopular/{id}")
    public Result deleteGoodsPopular(@PathVariable(value="id",required = true) String popularId,Admin admin) {
        return null;
    }

    @PostMapping("/listGoodsPopular")
    public Result listGoodsPopular(@RequestBody GoodsPopularSearchForm form,Admin admin) {
        return null;
    }

    @GetMapping("/detailGoodsPopular/{id}")
    public Result detailGoodsPopular(@PathVariable(value="id",required = true) String popularId,Admin admin) {
        return null;
    }

    @PostMapping("/updateGoodsPopular")
    public Result updateGoodsPopular(@RequestBody GoodsPopular goodsPopular,Admin admin) {
        return null;
    }

    @PostMapping("/listBoothComment")
    public Result listBoothComment(@RequestBody BoothCommentSearchForm form,Admin admin) {
        return null;
    }

    @GetMapping("/hideBoothComment/{id}")
    public Result hideBoothComment(@PathVariable(value="id",required = true) String commentId,Admin admin) {
        return null;
    }

    @GetMapping("/hideBoothCommentReply/{id}")
    public Result hideBoothCommentReply(@PathVariable(value="id",required = true) String replyId,Admin admin) {
        return null;
    }

    @PostMapping("/listGoodsComment")
    public Result listGoodsComment(@RequestBody GoodsCommentSearchForm form,Admin admin) {
        return null;
    }

    @GetMapping("/hideGoodsComment/{id}")
    public Result hideGoodsComment(@PathVariable(value="id",required = true) String commentId,Admin admin) {
        return null;
    }

    @GetMapping("/hideGoodsCommentReply/{id}")
    public Result hideGoodsCommentReply(@PathVariable(value="id",required = true) String replyId,Admin admin) {
        return null;
    }

    @PostMapping("/setTag")
    public Result setTag(@RequestBody BoothTagDTO boothTagDTO,Admin admin) {
        return null;
    }

    @PostMapping("/goodsViewRecord")
    public Result goodsViewRecord(@RequestBody GoodsViewRecordSearchForm form,Admin admin) {
        return null;
    }

    @PostMapping("/boothViewRecord")
    public Result boothViewRecord(@RequestBody BoothViewRecordSearchForm form,Admin admin) {
        return null;
    }
}
