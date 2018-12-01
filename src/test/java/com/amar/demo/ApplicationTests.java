package com.amar.demo;

import com.amar.demo.entity.Student;
import com.amar.demo.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = com.amar.demo.app.Application.class)
public class ApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    HelloService helloService;

    @Test
    public void testGetStudent() {
        Student student = helloService.getStudentById(1);
        System.out.println(student.getName());
    }

    @Test
    public void testListStudent() {
        List list = helloService.listStudent();
        list.forEach(map->System.out.println(map));
    }

}
