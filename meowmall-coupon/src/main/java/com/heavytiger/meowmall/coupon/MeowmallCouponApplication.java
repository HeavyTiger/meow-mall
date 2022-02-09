package com.heavytiger.meowmall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MeowmallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(MeowmallCouponApplication.class, args);
    }

}
