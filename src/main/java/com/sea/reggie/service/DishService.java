package com.sea.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sea.reggie.dto.DishDto;
import com.sea.reggie.entity.Dish;

import java.util.List;

/**
 * @Author: yongquan
 * @Date: 2022/9/16 9:47
 * @Description:
 */
public interface DishService extends IService<Dish> {

    //新增菜品，同时插入菜品对应的口味数据，需要操作两个表，dish,dish_flavor
     public void savaWithFlavor(DishDto dishDto);

     //根据id查询菜品信息和对应口味信息
     DishDto getByIdWithFlavor(Long id);

     //更新菜品信息，和对应口味信息
    void updateWithFlavor(DishDto dishDto);

    //批量删除菜品和相关联的口味信息
    void deleteWithFlavor(List<Long> ids);
}
