package com.example.meltykiss.dto.admin;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author: kissChinese
 * @CreateTime: 2024-07-28
 * @Description: 基础请求类
 * @Version: 1.0
 */

public class BaseDto {
    final public Integer pageSize;
    final public Integer currentPage;
    BaseDto(Integer pageSize, Integer currentPage) {
        this.pageSize = pageSize;
        this.currentPage = currentPage;
    }
}
