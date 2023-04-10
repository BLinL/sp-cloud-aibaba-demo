package com.bliu.d.feginclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="spring-cloud-alibaba-provider")
public interface DeptFeiginClient {

    /**
     * http://spring-cloud-alibaba-provider/dept/nacos/{id}
     * @param id
     * @return
     */
    @GetMapping("/dept/nacos/{id}")
    String getById(@PathVariable String id);

}
