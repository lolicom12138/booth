package xyz.apichiyu.project.controller.api.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.apichiyu.project.dto.api.user.UserLoginDTO;
import xyz.apichiyu.project.util.bean.Result;

@RestController
@RequestMapping("/api/user/login")
public class UserLoginApi {
    /**
     * 用户使用用户名和密码登录接口
     *
     * @return
     */
    @RequestMapping("/usernameLogin")
    public Result usernameLogin(UserLoginDTO userLoginDTO) {
        return null;
    }

    /**
     * 用户使用微信登陆的接口
     *
     * @return
     */
    @RequestMapping("/wechatLogin")
    public Result wechatLogin() {
        return null;
    }


    @RequestMapping("/logout")
    public Result logout() {
        return null;
    }

    @RequestMapping("/loginRecord")
    public Result listLoginRecord() {
        return null;
    }

}
