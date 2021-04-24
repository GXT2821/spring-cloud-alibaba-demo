package com.gt.springbootwebdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guotao
 * @email guo_tao_programmer@163.com
 * @date 2021/4/24 22:10
 * @project_name spring-cloud-alibaba-demo
 * @Class com.gt.springbootwebdemo.controller.TestController
 * @description
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    RedisTemplate<String, String> redisTemplate;

    @RequestMapping("/hello")
    public String hello(){
        return "Hello Spring Boot";
    }

    /**
     * @author guotao
     * @email guo_tao_programmer@163.com
     * @method  redis
     * @description Spring Boot自动装配
     * @date 2021/4/24 22:15
     * @return null
     */
    @RequestMapping("/redisSetValue")
    public String redisSetValue(){
        redisTemplate.opsForValue().set("key", "value");
        return "OK";
    }

    @RequestMapping("/redisGetValue")
    public String redisGetValue(){
        String value = redisTemplate.opsForValue().get("key");
        return value;
    }
}
