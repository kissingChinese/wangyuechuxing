package com.example.meltykiss.entity;

import com.baomidou.mybatisplus.annotation.IdType;

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
public class PassengerUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    private LocalDateTime gmt_create;

    private LocalDateTime gmt_modified;

    private String passenger_phone;

    private String passenger_surname;

    private String passenger_name;

    /**
     * 1：男，2：女
     */
    private Boolean passenger_gender;

    /**
     * 0：有效，1：失效
     */
    private Boolean state;

    /**
     * 头像图片地址的url
     */
    private String profile_photo;


}
