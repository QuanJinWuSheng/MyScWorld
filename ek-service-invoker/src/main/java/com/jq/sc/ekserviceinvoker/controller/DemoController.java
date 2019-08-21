package com.jq.sc.ekserviceinvoker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * com.jq.sc.ek_service_provider.controller
 *
 * @author WuJinquan 2019年08月21日22:21
 * @version 1.0
 */
@RestController
@RequestMapping(value = "invoker")
@Configuration //这个是负载均衡@LoadBalanced生效
public class DemoController {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }


    @RequestMapping(value = "test1")
    public Object providerTest1() {
        System.out.println("Hello World Invoker Test1!");
        return "Hello World Invoker Test1!";
    }

    @RequestMapping(value = "remote")
    public Object providerRemote() {
        RestTemplate restTemplate = getRestTemplate();
//        String result1 = restTemplate.getForObject("http://localhost:9902/provider/test1", String.class);

        String result = restTemplate.getForObject("http://ek-service-provider/provider/test1", String.class);
        return result;
    }


}
