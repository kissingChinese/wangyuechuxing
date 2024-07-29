package com.example.meltykiss.controller;

import com.example.meltykiss.Result;
import com.example.meltykiss.dto.admin.OrderDto;
import com.example.meltykiss.entity.OrderInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: kissChinese
 * @CreateTime: 2024-06-29
 * @Description: 订单
 * @Version: 1.0
 */
@RestController
@RequestMapping("api-boss/order")
@Api(value = "订单信息操作", tags = "06.订单信息")
public class OrderController {

    @ApiOperation("订单获取")
    @PostMapping("/list")
    Result getOrderList(@RequestBody OrderDto orderDto) {
        return Result.ok().data(null);
    }

    @ApiOperation("订单的更新")
    @PostMapping("/update")
        Result updateOrder(@RequestBody OrderInfo orderifo) {
            return Result.ok().data(null);
        }
}
