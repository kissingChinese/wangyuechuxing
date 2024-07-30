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
public class PriceRule implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 城市代码
     */
    private String city_code;

    /**
     * 车辆类型
     */
    private String vehicle_type;

    /**
     * 起步价
     */
    private Double start_fare;

    private Integer start_mile;

    private Double unit_price_per_mile;

    private Double unit_price_per_minute;

    private Integer fare_version;

    private String fare_type;


}
