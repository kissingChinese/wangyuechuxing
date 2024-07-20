package com.example.meltykiss.wangyuechuxing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class WangyuechuxingApplication {

    public static void main(String[] args) {
        SpringApplication.run(WangyuechuxingApplication.class, args);
    }

}
