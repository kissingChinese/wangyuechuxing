package com.example.meltykiss.dto.admin;

import lombok.Data;

/**
 * @Author: kissChinese
 * @CreateTime: 2024-07-28
 * @Description: 后台管理员登入参数
 * @Version: 1.0
 */
@Data
public class AdminDto {
    final public Integer UserName;
    final  public Integer Password;
}
