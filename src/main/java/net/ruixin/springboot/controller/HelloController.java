package net.ruixin.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: mxding
 * @Date: 2018-11-28 16:59
 */

@RestController
public class HelloController {


    @RequestMapping("/helloWorld")
    public String helloWorld() { return "Hello world"; }


    @RequestMapping("/hello")
    public String sayHello(@RequestParam String name) { return "Hello " + name; }
}
