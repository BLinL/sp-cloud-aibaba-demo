package com.bliu.d.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextBean {

    @Bean
    @LoadBalanced // 集成ribbon负载均衡
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
