package com.jq.sc.ek_service_provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EkServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(EkServiceProviderApplication.class, args);
    }

}
