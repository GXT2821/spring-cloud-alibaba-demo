package com.gt.springbootnacosdemo.controller;

import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.config.annotation.NacosIgnore;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.api.naming.pojo.Instance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author guotao
 * @email guo_tao_programmer@163.com
 * @date 2021/5/15 17:16
 * @project_name spring-cloud-alibaba-demo
 * @Class com.gt.springbootnacosdemo.controller.DiscoverController
 * @description
 */
@RestController
public class DiscoverController {

    @NacosInjected
    private NamingService namingService;

    @GetMapping("/discovery")
    public List<Instance> discovery(@RequestParam String serviceName) throws NacosException {
        return namingService.getAllInstances(serviceName);
    }


}
