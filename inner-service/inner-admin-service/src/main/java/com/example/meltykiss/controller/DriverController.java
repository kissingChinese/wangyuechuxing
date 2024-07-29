package com.example.meltykiss.controller;

import com.example.meltykiss.Result;
import com.example.meltykiss.dto.admin.DriverUserDto;
import com.example.meltykiss.entity.DriverUser;
import com.example.meltykiss.entity.DriverUserWorkStatus;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.sql.Driver;

/**
 * @Author: kissChinese
 * @CreateTime:2024-06-29
 * @Description: 查询司机的接口
 * @Version: 1.0
 */
@Api(value = "查询司机",tags = "查询某地区可用司机")
@RestController
@RequestMapping("/driver")
public class DriverController {


    @ApiOperation("根据地区的编号查询司机")
    @GetMapping("/{code}")
    Result getDriverByCode(@PathVariable("code") Integer code){
       return null;
    }

    /**
     * driver的状态的更新
     */

    /**
     * 查询司机的工作状态
     */
    @ApiOperation("根据司机的id获取司机的工作状态")
    @GetMapping("/status/{id}")
    Result getDriverStatus(@PathVariable("id") Integer id){
        return null;
    }

    /**
     * 更新司机的工作状态
     */
    @ApiOperation("更新司机的工作状态")
    @PostMapping("/status/update")
    Result changeWorkStatus(@RequestBody DriverUserWorkStatus driverUserWorkStatus){
        return null;
    }

    /**
     *获取司机的信息根据司机编号
     */
   @ApiOperation("根据司机的id获取司机的信息")
    @GetMapping("/info/{id}")
    Result getDriverInfo(@PathVariable("id") Integer id){
        return null;
    }

    /**
     * 获取司机列表
     */
    @ApiOperation("获取所有的司机")
    @PostMapping("info/list")
    Result getDriverInfoList(@RequestBody DriverUserDto drive){
        return null;
    }

    /**
     * 根据手机号查询司机信息
     */
    @ApiOperation("根据司机的手机号来获取司机的信息")
    @GetMapping("/info/{phone}")
    Result getDriverInfo(@PathVariable("phone") String phone){
        return null;
    }
    /**
     *添加司机
     */

    /**
     * 根据车牌号查询司机的订单信息
     * @param drive
     * @return
     */
    @GetMapping("order/info/{valNo}")
    Result getOrderInfoByPhone(@PathVariable("valNo") String valNo){
        return null;
    }

    /**
     *根据手机号查询司机和车辆的绑定关系
     * @param drive
     * @return
     */
    @GetMapping("/info/bind/{phone}")
    Result getDriverBindByPhone(@PathVariable("phone") String phone){
        return null;
    }

    @ApiOperation("添加司机")
      @PostMapping("添加司机")
      Result addDriver(@RequestBody DriverUser drive){
          return null;
      }

    /**
     *给司追加订单数量
     */
    @GetMapping("order/add/{driverId}")
    Result addDriver(@PathVariable Integer driverId){
        return null;
    }

}

