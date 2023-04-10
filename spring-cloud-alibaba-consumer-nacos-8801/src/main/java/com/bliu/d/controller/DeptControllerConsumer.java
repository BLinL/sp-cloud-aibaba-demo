package com.bliu.d.controller;

import com.bliu.d.feginclient.DeptFeiginClient;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class DeptControllerConsumer {

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private DeptFeiginClient deptFeiginClient;

    @Value("${service-url.nacos-user-service}")
    private String serverURL;

    @GetMapping("/consumer/nacos/{id}")
    public String paymentInfo(@PathVariable("id") Long id){
        log.debug("consumer call:" + serverURL + "/dept/nacos/" + id);
//        return restTemplate.getForObject(serverURL + "/dept/nacos/" + id, String.class);
        return deptFeiginClient.getById("" +id);
    }

}
