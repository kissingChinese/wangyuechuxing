package com.example.meltykiss.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
public class OrderInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 乘客ID
     */
    private Long passenger_id;

    /**
     * 乘客手机号
     */
    private String passenger_phone;

    /**
     * 司机ID
     */
    private Long driver_id;

    /**
     * 司机手机号
     */
    private String driver_phone;

    /**
     * 车辆Id
     */
    private Long car_id;

    private String vehicle_type;

    /**
     * 发起地行政区划代码
     */
    private String address;

    /**
     * 订单发起时间
     */
    private LocalDateTime order_time;

    /**
     * 预计用车时间
     */
    private LocalDateTime depart_time;

    /**
     * 预计出发地点详细地址
     */
    private String departure;

    /**
     * 预计出发地点经度
     */
    private String dep_longitude;

    /**
     * 预计出发地点纬度
     */
    private String dep_latitude;

    /**
     * 预计目的地
     */
    private String destination;

    /**
     * 预计目的地经度
     */
    private String dest_longitude;

    /**
     * 预计目的地纬度
     */
    private String dest_latitude;

    /**
     * 坐标加密标识	1:GCJ-02测绘局标准	2:WGS84 GPS标准	3:BD-09 百度标准	4:CGCS2000 北斗标准	0:其他
     */
    private Integer encrypt;

    /**
     * 运价类型编码
     */
    private String fare_type;

    private Integer fare_version;

    /**
     * 接单时车辆经度
     */
    private String receive_order_car_longitude;

    /**
     * 接单时车辆纬度
     */
    private String receive_order_car_latitude;

    /**
     * 接单时间，派单成功时间
     */
    private LocalDateTime receive_order_time;

    /**
     * 机动车驾驶证号
     */
    private String license_id;

    /**
     * 车辆号牌
     */
    private String vehicle_no;

    /**
     * 司机去接乘客出发时间
     */
    private LocalDateTime to_pick_up_passenger_time;

    /**
     * 去接乘客时，司机的经度
     */
    private String to_pick_up_passenger_longitude;

    /**
     * 去接乘客时，司机的纬度
     */
    private String to_pick_up_passenger_latitude;

    /**
     * 去接乘客时，司机的地点
     */
    private String to_pick_up_passenger_address;

    /**
     * 司机到达上车点时间
     */
    private LocalDateTime driver_arrived_departure_time;

    /**
     * 接到乘客，乘客上车时间
     */
    private LocalDateTime pick_up_passenger_time;

    /**
     * 接到乘客，乘客上车经度
     */
    private String pick_up_passenger_longitude;

    /**
     * 接到乘客，乘客上车纬度
     */
    private String pick_up_passenger_latitude;

    /**
     * 乘客下车时间
     */
    private LocalDateTime passenger_getoff_time;

    /**
     * 乘客下车经度
     */
    private String passenger_getoff_longitude;

    /**
     * 乘客下车纬度
     */
    private String passenger_getoff_latitude;

    /**
     * 订单撤销时间
     */
    private LocalDateTime cancel_time;

    /**
     * 撤销发起者：1:乘客	2:驾驶员	3:平台公司
     */
    private Integer cancel_operator;

    /**
     * 撤销类型代码	1:乘客提前撤销	2:驾驶员提前撤销	3:平台公司撤销	4;乘客违约撤销	5:驾驶员违约撤销
     */
    private Integer cancel_type_code;

    /**
     * 载客里程（米）
     */
    private Long drive_mile;

    /**
     * 载客时间(分)
     */
    private Long drive_time;

    /**
     * 订单状态1：订单开始 2：司机接单 3：去接乘客 4：司机到达乘客起点 5：乘客上车，司机开始行程 6：到达目的地，行程结束，未支付 7：发起收款 8: 支付完成 9.订单取消'
     */
    private Integer order_status;

    private Double price;

    /**
     * 创建时间
     */
    private LocalDateTime gmt_create;

    /**
     * 修改时间
     */
    private LocalDateTime gmt_modified;


}
