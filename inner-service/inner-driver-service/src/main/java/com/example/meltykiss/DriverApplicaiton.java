package com.example.meltykiss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDiscoveryClient
public class DriverApplicaiton {
    public static void main(String[] args) {
        SpringApplication.run(DriverApplicaiton.class, args);
    }
}
