package com.gt.springcloudnacosdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guotao
 * @email guo_tao_programmer@163.com
 * @date 2021/5/16 16:48
 * @project_name spring-cloud-alibaba-demo
 * @Class com.gt.springcloudnacosdemo.controller.NacosConfigController
 * @description
 */
//@RefreshScope  //动态更新nacos配置
@RestController
public class NacosConfigController {

    @Value("${info:}")
    private String info;

    @GetMapping("/getInfo")
    public String getNacosInfo(){

        return info;
    }


}
