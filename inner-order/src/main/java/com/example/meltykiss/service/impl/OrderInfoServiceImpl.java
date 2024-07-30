package com.example.meltykiss.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.meltykiss.entity.OrderInfo;
import com.example.meltykiss.mapper.OrderInfoMapper;
import com.example.meltykiss.service.IOrderInfoService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author kissChinese
 * @since 2024-07-21
 */
@Service
public class OrderInfoServiceImpl extends ServiceImpl<OrderInfoMapper, OrderInfo> implements IOrderInfoService {

}
