package com.sea.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sea.reggie.entity.ShoppingCart;
import com.sea.reggie.mapper.ShoppingCartMapper;
import com.sea.reggie.service.ShoppingCartService;
import org.springframework.stereotype.Service;

/**
 * @Author: yongquan
 * @Date: 2022/9/19 19:45
 * @Description:
 */
@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {
}
