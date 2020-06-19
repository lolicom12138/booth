package xyz.apichiyu.project.controller.api.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.apichiyu.project.util.bean.Result;

@RestController
@RequestMapping("/api/user/user")
public class UserApi {
    @RequestMapping("/register")
    public Result register() {
        return null;
    }

    @RequestMapping("/selfDelete")
    public Result selfDelete() {
        return null;
    }

    @RequestMapping("/moneyRecord")
    public Result listMoneyRecord() {
        return null;
    }
    @RequestMapping("/retireRecord")
    public Result listRetireRecord() {
        return null;
    }

    @RequestMapping("/message")
    public Result listMessage() {
        return null;
    }
}
