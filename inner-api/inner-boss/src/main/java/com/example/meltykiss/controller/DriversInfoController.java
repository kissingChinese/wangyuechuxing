package com.example.meltykiss.controller;

import com.example.meltykiss.Result;
import com.example.meltykiss.dto.admin.DriverUserDto;
import com.example.meltykiss.entity.DriverUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: kissChinese
 * @CreateTime: 2024-07-28
 * @Description: 管理员对司机的操作
 * @Version: 1.0
 */
@RestController
@RequestMapping("api-boss/driverinfo")
@Api(value = "管理员的司机的操作", tags = "05.管理员管理司机")
public class DriversInfoController {

    @ApiOperation(value = "查找司机信息")
    @PostMapping("/list")
    public Result getInfo(@RequestBody DriverUserDto driverUserDto){
        return Result.ok().data(null);
    }



    @ApiOperation(value = "添加、修改司机信息")
    @GetMapping("/change")
    public Result changeInfo(@RequestBody DriverUser driverUser){
        return Result.ok().data(null);
    }
}
