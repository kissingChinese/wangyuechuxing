package com.example.meltykiss.dto.admin;

import lombok.Data;

/**
 * @Author: kissChinese
 * @CreateTime: 2024-07-28
 * @Description: 查询司机信息请求类
 * @Version: 1.0
 */
@Data
public class DriverUserDto extends BaseDto {
    final public String address;
    final public String phone;
}
