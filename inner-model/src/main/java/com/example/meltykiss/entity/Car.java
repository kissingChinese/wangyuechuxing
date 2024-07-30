package com.example.meltykiss.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.Version;
import java.time.LocalDateTime;
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
public class Car implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 车辆所在城市
     */
    private String address;

    /**
     * 车辆号牌
     */
    private String vehicle_no;

    /**
     * 车牌颜色（1：蓝色，2：黄色，3：黑色，4：白色，5：绿色，9：其他）
     */
    private String plate_color;

    /**
     * 核定载客位
     */
    private Integer seats;

    /**
     * 车辆厂牌
     */
    private String brand;

    /**
     * 车辆型号
     */
    private String model;

    /**
     * 车辆类型（1：轿车，2：SUV，3：MPV， 4 ：面包车， 9：其他
     */
    private String vehicle_type;

    /**
     * 车辆所有人
     */
    private String owner_name;

    /**
     * 车辆颜色（1：白色，2：黑色）
     */
    private String vehicle_color;

    /**
     * 发动机号
     */
    private String engine_id;

    private String vin;

    /**
     * 车辆注册日期
     */
    private LocalDate certify_date_a;

    /**
     * 燃料类型(1：汽油，2：柴油，3：天然气，4：液化气，5：电动，9：其他）
     */
    private String fue_type;

    /**
     * 发动机排量（毫升）
     */
    private String engine_displace;

    /**
     * 车辆运输证发证机构
     */
    private String trans_agency;

    /**
     * 车辆经验区域
     */
    private String trans_area;

    /**
     * 车辆运输证有效期起
     */
    private LocalDate trans_date_start;

    /**
     * 车辆运输证有效期止
     */
    private LocalDate trans_date_end;

    /**
     * 车辆初次登记日期
     */
    private LocalDate certify_date_b;

    /**
     * 车辆的检修状态(0：未检修，1：已检修，2：未知）
     */
    private String fix_state;

    /**
     * 下次年检时间
     */
    private LocalDate next_fix_date;

    /**
     * 年度审验状态（0：未年审，1：年审合格，2：年审不合格）
     */
    private String check_state;

    /**
     * 发票打印设备序列号
     */
    private String fee_print_id;

    /**
     * 卫星定位装置品牌
     */
    private String gps_brand;

    /**
     * 卫星型号
     */
    private String gps_model;

    /**
     * 卫星定位设备安装日期
     */
    private LocalDate gps_install_date;

    /**
     * 报备日期
     */
    private LocalDate register_date;

    /**
     * 服务类型：1：网络预约出租车，2：巡游出租车，3：私人小客车合乘
     */
    private Integer commercial_type;

    /**
     * 运价编码 关联计价规则
     */
    private String fare_type;

    /**
     * 状态：0:有效，1：失效
     */
    private Boolean state;

    /**
     * 终端id
     */
    private String tid;

    /**
     * 轨迹id
     */
    private String trid;

    /**
     * 轨迹名称
     */
    private String trname;

    /**
     * 创建时间
     */
    private LocalDateTime gmt_create;

    /**
     * 修改时间
     */
    private LocalDateTime gmt_modified;


}
