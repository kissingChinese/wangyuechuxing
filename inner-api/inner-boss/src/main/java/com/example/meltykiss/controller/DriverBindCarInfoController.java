package com.example.meltykiss.controller;

import com.example.meltykiss.Result;
import com.example.meltykiss.entity.DriverCarBindingRelationship;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: kissChinese
 * @CreateTime: 2024-07-28
 * @Description: 司机和车辆的绑定信息
 * @Version: 1.0
 */
@RestController
@RequestMapping("/api-boss/driver")
@Api(value = "车辆绑定信息",tags = "04.管理员绑定车辆信息")
public class DriverBindCarInfoController {

    @ApiOperation(value = "绑定车辆")
    @PostMapping("/bind")
    Result bind(@RequestBody DriverCarBindingRelationship driverCarBindingRelationship) {
        return Result.ok().data(null);
    }

    @ApiOperation("解绑车辆")
    @PostMapping("/unbind")
    Result unbind(@RequestBody DriverCarBindingRelationship driverCarBindingRelationship) {
        return Result.ok().data(null);
    }
}
