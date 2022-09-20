package com.sea.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sea.reggie.entity.User;
import com.sea.reggie.mapper.UserMapper;
import com.sea.reggie.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Author: yongquan
 * @Date: 2022/9/18 21:44
 * @Description:
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
