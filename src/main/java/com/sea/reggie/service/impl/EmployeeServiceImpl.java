package com.sea.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sea.reggie.entity.Employee;
import com.sea.reggie.mapper.EmployeeMapper;
import com.sea.reggie.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * @Author: yongquan
 * @Date: 2022/9/14 19:25
 * @Description:
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
