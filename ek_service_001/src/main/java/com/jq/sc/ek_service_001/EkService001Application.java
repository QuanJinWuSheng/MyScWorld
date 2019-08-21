package com.jq.sc.ek_service_001;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.Scanner;

@SpringBootApplication
@EnableEurekaServer
public class EkService001Application {

    //    public static void main(String[] args) {
//        SpringApplication.run(EkService001Application.class, args);
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String profiles = scanner.nextLine();
        new SpringApplicationBuilder(EkService001Application.class).profiles(profiles).run(args);
    }
}
