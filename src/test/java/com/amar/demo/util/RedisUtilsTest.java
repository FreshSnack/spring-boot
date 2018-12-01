package com.amar.demo.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = com.amar.demo.app.Application.class)
public class RedisUtilsTest {

    @Autowired
    RedisUtils redisUtils;

    @Test
    public void setValue() {
        redisUtils.set("name", "Tom");
    }

    @Test
    public void getValue() {
        System.out.println(redisUtils.get("aa"));
    }
}