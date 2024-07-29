package com.example.meltykiss.controller;

import com.example.meltykiss.Result;
import com.example.meltykiss.entity.Car;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: kissChinese
 * @CreateTime:2024-06-29
 * @Description: 车辆信息接口
 * @Version: 1.0
 */
@RestController
@RequestMapping("/car")
public class CarController {

    /**
     * 获取车辆详细信息
     */
    @ApiOperation("根据车辆id获取车辆")
    @GetMapping("/info/list/{id}")
    public Result getCarList(@PathVariable int id) {
        return null;
    }

    /**
     *添加、更新车辆信息
     */
    @ApiOperation("添加或者修改汽车信息")
    @PostMapping("/add")
    public Result addCar(@RequestBody Car car) {
        return null;
    }
}
