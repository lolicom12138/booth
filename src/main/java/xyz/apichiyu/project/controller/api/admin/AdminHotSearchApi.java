package xyz.apichiyu.project.controller.api.admin;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "热搜", tags = "管理热搜")
@RequestMapping("/api/admin/hotSearch")
public class AdminHotSearchApi {

}
