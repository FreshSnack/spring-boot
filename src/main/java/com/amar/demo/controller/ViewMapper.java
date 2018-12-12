package com.amar.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author dingmx
 * @date 2018/12/11 22:12
 */

@Controller
@RequestMapping("/page")
public class ViewMapper {

    @RequestMapping("/{name}")
    public String getView(@PathVariable String name) { return name; }
}
