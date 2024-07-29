package com.example.meltykiss.controller;

import com.example.meltykiss.Result;
import com.example.meltykiss.entity.Car;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: kissChinese
 * @CreateTime: 2024-07-28
 * @Description: 车辆信息的相关接口
 * @Version: 1.0
 */
@RestController
@RequestMapping("/api-boss/car")
@Api(value = "获取车辆信息",tags = "02.管理员获取车辆信息")
public class CarController {
    @ApiOperation("获取车辆")
    @PostMapping("/list")
    Result getCarList(){

        return Result.ok().data(null);
    }

    @ApiOperation("添加或者修改车辆")
    @PostMapping("/change")
    Result changeCar(@RequestBody Car car) {
        return Result.ok().data(null);
    }
}
