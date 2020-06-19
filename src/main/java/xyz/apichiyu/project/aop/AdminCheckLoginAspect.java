package xyz.apichiyu.project.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import xyz.apichiyu.project.entity.Admin;
import xyz.apichiyu.project.entity.User;
import xyz.apichiyu.project.service.AdminService;
import xyz.apichiyu.project.service.impl.AdminServiceImpl;
import xyz.apichiyu.project.util.JsonUtil;
import xyz.apichiyu.project.util.RequestUtil;
import xyz.apichiyu.project.util.bean.Result;

/**
 * 管理员登录情况检查
 * 根据url中的get参数判断登录状态
 * 对于xyz.apichiyu.project.controller.admin内的所有控制器有效
 * 例外方法为AdminLoginApi中的login方法
 * 对于方法中最后一个参数，注入登录信息
 * @author 李源
 */
@Aspect
@Component
public class AdminCheckLoginAspect {
    private AdminService adminService;
    @Autowired
    public AdminCheckLoginAspect(AdminServiceImpl adminService){
        this.adminService = adminService;
    }
    @Pointcut(value = "execution(public * xyz.apichiyu.project.controller.api.admin..*(..)) && !execution(public * xyz.apichiyu.project.controller.api.admin.AdminLoginApi.login(..))")
    public void needLoginCheck(){}
    @Around("needLoginCheck()")
    public Object needLogin(ProceedingJoinPoint pjp) throws Throwable {
        String sessionId = RequestUtil.getGetParameter("sessionId");
        String nonceStr = RequestUtil.getGetParameter("nonceStr");
        String sign = RequestUtil.getGetParameter("sign");
        if(sessionId != null && nonceStr != null && sign != null){
            Admin admin = adminService.checkLogin(sessionId,nonceStr,sign);
            if(null != admin){
                Object[] obj = pjp.getArgs();
                Object argItem = obj[obj.length-1];
                if (argItem instanceof Admin) {
                    Admin a = (Admin) argItem;
                    a.setActive(admin.isActive());
                    a.setListAuthority(admin.getListAuthority());
                    a.setLogin(admin.getLogin());
                    a.setPwd(admin.getPwd());
                    a.setSessionId(admin.getSessionId());
                    a.setSessionKey(admin.getSessionKey());
                    a.setVersion(admin.getVersion());
                    a.setId(admin.getId());
                }
                return pjp.proceed();
            }
        }
        return Result.fail("权限校验错误");
    }
}
