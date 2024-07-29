package com.example.meltykiss.dto.admin;

import lombok.Data;

/**
 * @Author: kissChinese
 * @CreateTime: 2024-06-29
 * @Description: 订单的dto
 * @Version: 1.0
 */

@Data
public class OrderDto extends BaseDto {
    final public String phone;
    final public String adress;
}
