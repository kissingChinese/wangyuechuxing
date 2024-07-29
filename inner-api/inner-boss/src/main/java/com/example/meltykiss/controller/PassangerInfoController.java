package com.example.meltykiss.controller;

import com.example.meltykiss.Result;
import com.example.meltykiss.dto.admin.PassangerDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: kissChinese
 * @CreateTime: 2024-06-29
 * @Description: 乘客相关信息
 * @Version: 1.0
 */

@RestController
@RequestMapping("api-boss/passanger")
@Api(value = "乘客信息接口", tags = "07.乘客信息")
public class PassangerInfoController {

    @ApiOperation(value = "获取乘客信息接口")
    @PostMapping("/list")
    Result getInfo(PassangerDto passangerDto){
        return Result.ok().data(null);
    }
}
