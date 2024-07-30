package com.example.meltykiss;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.example.meltykiss.mapper")
@ComponentScan({"com.example.meltykiss.service","com.example.meltykiss.controller"})
public class AdminApplicaiton {
    public static void main(String[] args) {
        SpringApplication.run(AdminApplicaiton.class, args);
    }
}
