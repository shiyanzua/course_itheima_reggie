package com.sea.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sea.reggie.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: yongquan
 * @Date: 2022/9/14 19:22
 * @Description:
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
