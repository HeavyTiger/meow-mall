package com.heavytiger.meowmall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.heavytiger.meowmall.member.feign")
public class MeowmallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(MeowmallMemberApplication.class, args);
    }

}
