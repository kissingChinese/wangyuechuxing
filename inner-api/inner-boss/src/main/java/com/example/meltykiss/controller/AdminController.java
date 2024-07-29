package com.example.meltykiss.controller;

import com.example.meltykiss.Result;
import com.example.meltykiss.dto.admin.AdminDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.sql.ResultSet;

/**
 * @Author: kissChinese
 * @CreateTime: 2024-07-28
 * @Description: 管理员后台登录相关接口
 * @Version: 1.0
 */
@RestController
@RequestMapping("api-boss/admin")
@Api(value = "提供管理员后台端的登入、登出、获取管理员身份信息的接口", tags = "01.管理员身份信息管理")
public class AdminController {
    @ApiOperation(value = "管理员登入")
    @PostMapping("/login")
    Result login(@RequestBody AdminDto adminDto){

        return Result.ok();
    }


    @ApiOperation(value = "获取管理员信息")
    @GetMapping("/info")
    Result info(@RequestParam String token){

    return Result.ok().data(null);
    }


    @ApiOperation("登出")
    @PostMapping("/logout")
    Result logout(){
     return Result.ok();
    }
}
