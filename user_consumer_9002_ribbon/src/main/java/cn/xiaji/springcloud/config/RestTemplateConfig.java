package cn.xiaji.springcloud.config;
//encoding: utf-8

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: xj
 * @contact: xiaruji520@gmail.com
 * @file: RestTemplateConfig.java
 */
/*

 */
@Configuration
public class RestTemplateConfig {
    //配置RestTemplate
    @Bean
    @LoadBalanced //开启负载均衡 默认轮询
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean //修改负载均衡策略 常用三种:轮询 可利用性 权重
    public IRule rule() {
        return new RandomRule();
    }
}