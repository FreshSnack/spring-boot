package com.amar.demo.controller;

import com.amar.demo.entity.User;
import com.amar.demo.exception.BusinessException;
import com.amar.demo.resolver.FormModel;
import com.amar.demo.service.UserService;
import com.amar.demo.util.AjaxReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * @author dingmx
 * @date 2018/12/1 11:09
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public String addUser(@FormModel User user) {
        return AjaxReturn.success(userService.addUser(user));
    }

    @PostMapping("/add2")
    public String addUser2(@RequestBody User user) {
        return AjaxReturn.success(userService.addUser(user));
    }

    @GetMapping("/all")
    public String findAllUser(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "10")
                    int pageSize) {
        return AjaxReturn.success(userService.findAllUser(pageNum, pageSize));
    }

    @ExceptionHandler({BusinessException.class})
    @ResponseStatus(HttpStatus.EXPECTATION_FAILED)
    public String handlerBusinessException(BusinessException e) {
        return AjaxReturn.failure("[BusinessException]" + e.getMessage());
    }
}
