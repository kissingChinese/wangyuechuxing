package com.example.meltykiss.controller;
import com.example.meltykiss.Result;
import com.example.meltykiss.dto.admin.PassangerDto;
import com.example.meltykiss.dto.passanger.CheckCodeDto;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: kissChinese
 * @CreateTime: 2024-06-29
 * @Description: 乘客相关接口业务
 * @Version: 1.0
 */
@Api("乘客接口")
@RestController
@RequestMapping("/passanger")
public class PassangerController {

    /**
     * 根据id来获取乘客信息
     * @param id
     * @return
     */
    @GetMapping("/info/{id}")
    Result getPassangerById(@PathVariable Integer id) {
        return null;
    }


    /**
     * 根据号码获取乘客信息
     */
    @GetMapping("/info/{phone}")
    Result getPassangerByPhone(@PathVariable String phone) {
        return null;
    }

    /**
     * 获取所有乘客信息,进行分页信息的显示
     * @param passangerDto
     * @return
     */
    @RequestMapping("/info/list")
    Result getPassangerList(PassangerDto passangerDto) {
        return null;
    }

    /**
     * 登入/注册接口信息
     */
    Result PassangerLogin(@RequestBody CheckCodeDto checkCodeDto) {
        return null;
    }

}
