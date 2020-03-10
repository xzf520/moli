package cc.oldx.modules.system.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: moli
 * @Email: 974751082@qq.com
 * @qq: 974751082
 * @Date: 2020/3/11 2:23
 */
@RestController
public class IndexCtroller {
    @RequestMapping("/hello")
    private String hello(){
        return "欢迎来到oldx-admin";
    }
}
