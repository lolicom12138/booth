package xyz.apichiyu.project.controller.api.booth;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Test {
    @RequestMapping("/test")
    public String test(){
        System.out.println("xxx");
        int a = 1/0;
        return "abc";
    }
}
