package com.amar.demo.controller;

import com.amar.demo.util.AjaxReturn;
import com.amar.demo.util.JacksonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author dingmx
 * @date 2018/12/1 15:52
 */
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login() { return "login"; }

    @ResponseBody
    @RequestMapping("/loginValid")
    public String loginValid(@RequestParam String username, @RequestParam String password) {
        System.out.println("username:" + username);
        System.out.println("password:" + password);
        return AjaxReturn.success("login success");
    }
}
