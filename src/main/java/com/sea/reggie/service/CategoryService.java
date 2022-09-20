package com.sea.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sea.reggie.entity.Category;

/**
 * @Author: yongquan
 * @Date: 2022/9/15 23:13
 * @Description:
 */
public interface CategoryService extends IService<Category> {

    void remove(Long id);
}
