package net.ruixin.springboot.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import net.ruixin.springboot.entity.Student;
import net.ruixin.springboot.service.HelloService;
import net.ruixin.springboot.util.JacksonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: mxding
 * @Date: 2018-11-28 16:59
 */

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping("/helloWorld")
    public String helloWorld() { return "Hello world"; }


    @RequestMapping("/hello")
    public String sayHello(@RequestParam String name) { return "Hello " + name; }

    @RequestMapping("/getStudent")
    public String getStudent(@RequestParam int id) {
        Student student = helloService.getStudentById(id);
        return JacksonUtils.toJSon(student);
    }
}
