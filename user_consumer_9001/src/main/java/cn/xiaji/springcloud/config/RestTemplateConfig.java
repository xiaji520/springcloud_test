package cn.xiaji.springcloud.config;
//encoding: utf-8

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
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}