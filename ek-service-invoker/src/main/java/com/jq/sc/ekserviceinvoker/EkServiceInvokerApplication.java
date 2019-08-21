package com.jq.sc.ekserviceinvoker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EkServiceInvokerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EkServiceInvokerApplication.class, args);
    }

}
