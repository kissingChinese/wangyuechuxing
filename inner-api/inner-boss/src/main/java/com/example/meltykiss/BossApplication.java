package com.example.meltykiss;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: kissChinese
 * @CreateTime: 2024-07-28
 * @Description: boss-api启动类
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class BossApplication {
    public static void main(String[] args) {
        SpringApplication.run(BossApplication.class);
    }
}
