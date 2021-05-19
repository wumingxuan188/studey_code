package com.ruoyi.customer.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RuoyiCustomerAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(RuoyiCustomerAuthApplication.class, args);
    }

}
