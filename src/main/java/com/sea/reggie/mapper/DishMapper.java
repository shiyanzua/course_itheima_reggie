package com.sea.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sea.reggie.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: yongquan
 * @Date: 2022/9/16 9:45
 * @Description:
 */
@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}
