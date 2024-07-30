package com.example.meltykiss.dto.passanger;

/**
 * @Author: kissChinese
 * @CreateTime: 2024-07-01
 * @Description: 乘客计价规则封装请求类
 * @Version: 1.0
 */

public class PriceRulesDto {
    //城市编码
    private String cityCode;
    //车辆类型
    private String vehicleType;
    // 出发地经度
    private String depLongitude;

    // 出发地纬度
    private String depLatitude;

    // 目的地经度
    private String destLongitude;

    // 目的地纬度
    private String destLatitude;
}
