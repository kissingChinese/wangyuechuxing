package com.example.meltykiss.dto.admin;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: kissChinese
 * @CreateTime: 2024-07-28
 * @Description: 车辆获取封装请求类
 * @Version: 1.0
 */
@Data
public class CarDto extends BaseDto{
     public Integer carNo;
     public String address;
}
