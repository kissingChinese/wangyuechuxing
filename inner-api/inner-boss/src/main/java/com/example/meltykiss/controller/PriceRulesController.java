package com.example.meltykiss.controller;

import com.example.meltykiss.Result;
import com.example.meltykiss.dto.admin.RulesDto;
import com.example.meltykiss.entity.PriceRule;
import com.rabbitmq.client.Return;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: kissChinese
 * @CreateTime: 2024-06-29
 * @Description: 乘客计价规则
 * @Version: 1.0
 */
@RestController
@RequestMapping("api-boss/price")
@Api(value = "乘客计价规则", tags = "08.乘客计价规则")
public class PriceRulesController {

    @ApiOperation("获取乘客计价规则接口")
    @PostMapping("/list")
    Result getPriceRules(@RequestBody RulesDto rulesDto) {

        return Result.ok().data(null);
    }

    @ApiOperation("添加乘客计价规则接口")
    @PostMapping("/add")
    Result addRules(@RequestBody PriceRule priceRule) {
        return Result.ok().data(null);
    }

    @ApiOperation("修改乘客计价规则接口")
    @PostMapping("/update")
    Result updateRules(@RequestBody PriceRule priceRule) {
        return Result.ok().data(null);
    }
}
