package com.sea.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sea.reggie.dto.SetmealDto;
import com.sea.reggie.entity.Setmeal;

import java.util.List;

/**
 * @Author: yongquan
 * @Date: 2022/9/16 9:48
 * @Description:
 */
public interface SetmealService extends IService<Setmeal> {
    /**
     * 新增套餐，同时要保存套餐和菜品的关联关系
     * @param setmealDto
     */
    void saveWithDish(SetmealDto setmealDto);

    /**
     * 删除套餐，同时删除套餐和菜品的关联数据
     * @param ids
     */
    void removeWithDish(List<Long> ids);

    /**
     * 根据套餐id获取关联菜品信息
     * @param id
     * @return
     */
    SetmealDto getByIdWithDish(Long id);

    void updateWithDish(SetmealDto setmealDto);

}
