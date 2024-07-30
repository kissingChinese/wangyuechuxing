package com.example.meltykiss.controller;

import com.example.meltykiss.Result;
import com.example.meltykiss.dto.map.CenterDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: kissChinese
 * @CreateTime: 2024-07-30
 * @Description: 地图功能的接口
 * @Version: 1.0
 */
@Api("地图服务接口")
@RestController
@RequestMapping("/district")
public class MapServiceController {

    /**
     *创建终端
     * @param name
     * @param desc
     * @return
     */
    @ApiOperation("创建终端")
    @PostMapping("/add/terminal")
    Result addTerminal(@RequestParam("name") String name,@RequestParam("desc") String desc) {
        return Result.ok().data(null);
    }

    /**
     * 区域内搜索车辆
     * @param centerDto
     * @return
     */
    @ApiOperation("区域的搜索")
    @PostMapping("/search")
    Result search(@RequestBody CenterDto centerDto) {
        return Result.ok().data(null);
    }

    //轨迹的查询
    @ApiOperation("轨迹查询")
    @PostMapping("/trace")
    Result getTrace(@RequestBody CenterDto centerDto) {
        return Result.ok().data(null);
    }

    //修改终端
    @ApiOperation("修改终端")
    @PostMapping("/update")
    Result updateTerminal(@RequestBody CenterDto centerDto) {
        return Result.ok().data(null);
    }


    @ApiOperation("添加轨迹")
    @PostMapping("/add/trace")
    public Result add(String tid){
        return Result.ok().data(null);
    }
}
