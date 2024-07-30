package com.example.meltykiss.controller;

import com.example.meltykiss.Result;
import com.example.meltykiss.dto.passanger.PointDto;
import com.example.meltykiss.dto.passanger.PriceRulesDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author: kissChinese
 * @CreateTime: 2024-07-01
 * @Description: 区域信息接口
 * @Version: 1.0
 */
@Api("区域接口")
@RestController
@RequestMapping("/district")
public class DistrictController {
    /**
     * 根据关键词进行信息的获取
     * @param keywords
     * @return
     */
    @ApiOperation("获取指定区域的信息")
    @GetMapping("/info")
    public Result getInfo(String keywords) {
        return Result.ok().data(null);
    }

    @ApiOperation("获取本地词库的信息")
    @GetMapping("local-district")
    public Result getLocalDistrict() {
        return Result.ok().data(null);
    }

    @ApiOperation("乘客的价格获取")
    @PostMapping("/price/rules")
    Result getPriceRules(@RequestBody PriceRulesDto priceRulesDto) {
        return Result.ok().data(null);
    }

    @ApiOperation("地图轨迹点的上传")
    @PostMapping("/upload")
    Result upload(@RequestBody PointDto pointDto) {
        return Result.ok().data(null);
    }

    @ApiOperation("服务的创建")
    @PostMapping("/add/service")
    Result addTerminalService(String name){
        return Result.ok().data(null);
    }
}
