package com.example.meltykiss.controller;

import com.example.meltykiss.Result;
import com.example.meltykiss.entity.DriverCarBindingRelationship;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: kissChinese
 * @CreateTime:2024-06-29
 * @Description: 司机和车辆之间的绑定关系
 * @Version: 1.0
 */
@RestController
@RequestMapping("/driver")
public class DriverBindController {

    @PostMapping("/bind")
    Result bind(@RequestBody DriverCarBindingRelationship driverCarBindingRelationship) {
        return null;
    }

    @PostMapping("/unbind")
    Result unbind(@RequestBody DriverCarBindingRelationship driverCarBindingRelationship) {
        return null;
    }
}
