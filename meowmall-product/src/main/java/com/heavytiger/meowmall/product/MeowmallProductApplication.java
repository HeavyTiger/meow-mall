package com.heavytiger.meowmall.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MeowmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MeowmallProductApplication.class, args);
    }

}
