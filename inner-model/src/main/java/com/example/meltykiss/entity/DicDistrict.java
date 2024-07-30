package com.example.meltykiss.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author kissChinese
 * @since 2024-07-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class DicDistrict implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 地区编码
     */
    @TableId(value = "address_code", type = IdType.ASSIGN_ID)
    private String address_code;

    /**
     * 地区名称
     */
    private String address_name;

    /**
     * 父地区编码
     */
    private String parent_address_code;

    /**
     * 级别
     */
    private Integer level;


}
