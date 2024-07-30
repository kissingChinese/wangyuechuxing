package com.example.meltykiss.controller;

import com.example.meltykiss.Result;
import com.example.meltykiss.dto.order.OrderInfoDto;
import com.example.meltykiss.entity.OrderInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: kissChinese
 * @CreateTime: 2024-07-30
 * @Description: 订单操作接口
 * @Version: 1.0
 */
@Api("订单接口")
@RestController
@RequestMapping("/order")
public class OrderController {

    @ApiOperation("创建订单")
    @PostMapping("/create")
    Result createOrder(@RequestBody OrderInfoDto orderDto) {
        return Result.ok().data(null);
    }




    @ApiOperation("获取订单详情")
    @GetMapping("/detail")
    Result detailOrder(Integer orderId) {
        return Result.ok().data(null);
    }

    @ApiOperation("接乘客")
    @PostMapping("/pick/passanger")
    Result pickUpPassanger(@RequestBody OrderInfoDto orderDto){
        return Result.ok().data(null);
    }



    @ApiOperation("乘客到达目的地")
    @PostMapping("/arrive/passanger")
    Result arrivePassanger(@RequestBody OrderInfoDto orderDto){
        return Result.ok().data(null);
    }

    @ApiOperation("乘客上车")
    @PostMapping("/get/on")
    Result getOn(@RequestBody OrderInfoDto orderDto){
    return Result.ok().data(null);
    }


    @ApiOperation("乘客到达目的地")
    @PostMapping("/get/off")
    Result getOff(@RequestBody OrderInfoDto orderDto){
        return Result.ok().data(null);
    }

    @ApiOperation("发收款")
    @PostMapping("/pay/order")
    Result pay(@RequestBody OrderInfoDto orderDto){
        return Result.ok().data(null);
    }


    @ApiOperation("支付完成")
    Result paySucess(OrderInfoDto orderDto){
        return Result.ok().data(null);
    }


    @ApiOperation("订单取消")
    @PostMapping("/cancel")
    Result cancelOrder(@RequestParam Long orderId,@RequestParam String identity){
        return Result.ok().data(null);
    }

    /**
     * 判断当前用户有无正在进行中的订单
     * @param phone
     * @param identity
     * @return
     */
    @GetMapping("/current/{phone}/{identity}")
    public Result<OrderInfo> current(@PathVariable String phone ,@PathVariable String identity){
        return Result.ok().data(null);
    }

    /**
     * 获取正在行程中的订单详情
     * @param orderId
     * @return
     */
    @GetMapping("/current/order/detail")
    public Result currentOrderDetail(@RequestParam Long orderId){
        return Result.ok().data(null);
    }


    /**
     * 获取用户所有订单
     * @param phone
     * @param identity
     * @return
     */
    @GetMapping("/all/{phone}/{identity}")
    public Result getAllOrders(@PathVariable String phone , @PathVariable String identity){
        return Result.ok().data(null);
    }

    @PostMapping("/get/order/list")
    public Result getOrderList(@RequestBody OrderInfoDto orderInfoDto){
        return Result.ok().data(null);
    }

    @PostMapping("/update")
    public Result updateOrder(@RequestBody OrderInfo orderInfo){
        return Result.ok().data(null);
    }
}
