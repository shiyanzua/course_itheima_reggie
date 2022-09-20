package com.sea.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sea.reggie.entity.OrderDetail;
import com.sea.reggie.mapper.OrderDetailMapper;
import com.sea.reggie.service.OrderDetailService;
import org.springframework.stereotype.Service;

/**
 * @Author: yongquan
 * @Date: 2022/9/20 11:03
 * @Description:
 */
@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {
}
