package com.amar.demo.controller;

import com.amar.demo.entity.User;
import com.amar.demo.resolver.FormModel;
import com.amar.demo.service.UserService;
import com.amar.demo.util.AjaxReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author dingmx
 * @date 2018/12/1 11:09
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @ResponseBody
    @PostMapping("/add")
    public String addUser(@FormModel User user) {
        return AjaxReturn.success(userService.addUser(user));
    }

    @ResponseBody
    @PostMapping("/add2")
    public String addUser2(@RequestBody User user) {
        return AjaxReturn.success(userService.addUser(user));
    }

    @RequestMapping("/form")
    public String addUserForm() {
        return "userForm";
    }

    @GetMapping("/all")
    public Object findAllUser(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "10")
                    int pageSize) {

        return userService.findAllUser(pageNum, pageSize);
    }
}
