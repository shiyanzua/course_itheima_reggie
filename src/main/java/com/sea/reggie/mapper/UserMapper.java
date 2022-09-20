package com.sea.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sea.reggie.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: yongquan
 * @Date: 2022/9/18 21:42
 * @Description:
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
