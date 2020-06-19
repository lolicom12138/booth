package xyz.apichiyu.project.controller.microService.admin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.apichiyu.project.entity.Admin;

@RestController
@RequestMapping("/service/admin/login")
public class AdminLoginService {
    @RequestMapping("/login")
    public Admin login(){
        return new Admin();
    }
}
