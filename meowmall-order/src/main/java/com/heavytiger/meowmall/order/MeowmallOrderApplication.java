package com.heavytiger.meowmall.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MeowmallOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(MeowmallOrderApplication.class, args);
    }

}
