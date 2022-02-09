package com.heavytiger.meowmall.ware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MeowmallWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(MeowmallWareApplication.class, args);
    }

}
