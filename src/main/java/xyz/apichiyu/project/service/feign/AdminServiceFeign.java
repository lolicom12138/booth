package xyz.apichiyu.project.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import xyz.apichiyu.project.entity.Admin;

//@FeignClient(value = "dt-admin")
@FeignClient(value = "project-dt")
public interface AdminServiceFeign {
    @RequestMapping("/service/admin/login/login")
    public Admin login();
}
