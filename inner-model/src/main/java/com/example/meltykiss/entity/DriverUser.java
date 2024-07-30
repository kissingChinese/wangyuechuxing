package com.example.meltykiss.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
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
public class DriverUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 司机注册地行政区划代码
     */
    private String address;

    /**
     * 司机姓
     */
    private String driver_surname;

    /**
     * 司机姓名
     */
    private String driver_name;

    private String driver_phone;

    /**
     * 1:男，2：女
     */
    private Integer driver_gender;

    private LocalDate driver_birthday;

    /**
     * 驾驶员民族
     */
    private String driver_nation;

    /**
     * 司机完成总单数
     */
    private Long total_orders;

    private String driver_contact_address;

    /**
     * 机动车驾驶证号
     */
    private String license_id;

    /**
     * 初次领取驾驶证日期
     */
    private LocalDate get_driver_license_date;

    /**
     * 驾驶证有效期起
     */
    private LocalDate driver_license_on;

    /**
     * 驾驶证有效期止
     */
    private LocalDate driver_license_off;

    /**
     * 是否巡游出租汽车：1：是，0：否
     */
    private Integer taxi_driver;

    /**
     * 网络预约出租汽车驾驶员资格证号
     */
    private String certificate_no;

    /**
     * 网络预约出租汽车驾驶员发证机构
     */
    private String network_car_issue_organization;

    /**
     * 资格证发证日期
     */
    private LocalDate network_car_issue_date;

    /**
     * 初次领取资格证日期
     */
    private LocalDate get_network_car_proof_date;

    /**
     * 资格证有效起始日期
     */
    private LocalDate network_car_proof_on;

    /**
     * 资格证有效截止日期
     */
    private LocalDate network_car_proof_off;

    /**
     * 报备日期
     */
    private LocalDate register_date;

    /**
     * 服务类型：1：网络预约出租汽车，2：巡游出租汽车，3：私人小客车合乘
     */
    private Integer commercial_type;

    /**
     * 驾驶员合同（协议）签署公司
     */
    private String contract_company;

    /**
     * 合同（协议）有效期起
     */
    private LocalDate contract_on;

    /**
     * 合同有效期止
     */
    private LocalDate contract_off;

    /**
     * 司机状态：0：有效，1：失效
     */
    private Integer state;

    /**
     * 创建时间
     */
    private LocalDateTime gmt_create;

    /**
     * 修改时间
     */
    private LocalDateTime gmt_modified;


}
