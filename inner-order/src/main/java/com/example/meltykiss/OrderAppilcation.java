package com.example.meltykiss;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.example.meltykiss.mapper")
@ComponentScan({"com.example.meltykiss.service","com.example.meltykiss.controller"})
@EnableFeignClients
public class OrderAppilcation {
    public static void main(String[] args) {
        SpringApplication.run(OrderAppilcation.class, args);
    }
}