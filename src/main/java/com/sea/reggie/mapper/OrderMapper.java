package com.sea.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sea.reggie.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: yongquan
 * @Date: 2022/9/20 10:57
 * @Description:
 */
@Mapper
public interface OrderMapper extends BaseMapper<Orders> {
}
