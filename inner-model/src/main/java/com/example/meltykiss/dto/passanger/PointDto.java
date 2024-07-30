package com.example.meltykiss.dto.passanger;

import io.swagger.annotations.ApiOperation;

/**
 * @Author: kissChinese
 * @CreateTime: 2024-07-01
 * @Description: 乘客轨迹点的上传(类的参数请参考高德地图区域信息的接口文档）
 * @Version: 1.0
 */
@ApiOperation("乘客轨迹点")
public class PointDto {
    //todo
    private String tid;
    //todo
    private String trid;
    private com.example.meltykiss.dto.map.PointDto[] points;
}
