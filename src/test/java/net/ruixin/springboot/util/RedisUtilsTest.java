package net.ruixin.springboot.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
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