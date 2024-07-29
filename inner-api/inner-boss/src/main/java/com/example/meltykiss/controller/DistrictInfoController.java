package com.example.meltykiss.controller;

import com.example.meltykiss.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: kissChinese
 * @CreateTime: 2024-07-28
 * @Description: 获取区域信息
 * @Version: 1.0
 */
@RestController
@RequestMapping("/api-boss/district")
@Api(value = "获取区域信息",tags = "03.管理员获取区域信息")
public class DistrictInfoController {
    @ApiOperation(value = "获取区域信息")
    @GetMapping("/info")
    Result getInfo(){
        return Result.ok().data(null);
    }
}
