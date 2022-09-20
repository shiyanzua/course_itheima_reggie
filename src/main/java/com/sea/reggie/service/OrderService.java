package com.sea.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sea.reggie.entity.Orders;

/**
 * @Author: yongquan
 * @Date: 2022/9/20 11:00
 * @Description:
 */
public interface OrderService extends IService<Orders> {

    /**
     * 用户下单
     * @param orders
     */
    void submit(Orders orders);
}
