package cc.oldx.modules.system.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    private String hello() {
        return "欢迎来到oldx-admin";
    }

    @PreAuthorize("hasAuthority('user:add99999999')")
    @RequestMapping(value = "/hello1", method = RequestMethod.POST)
    private String hello1() {
        return "欢迎来到oldx-admin321312";
    }

    @RequestMapping("/hello2")
    @PreAuthorize("hasAuthority('user:add')")
    private String hello2() {
        return "欢迎来到oldx-admin321312";
    }
}
