package com.sea.reggie.common;

/**
 * 自定义业务异常
 * @Author: yongquan
 * @Date: 2022/9/16 10:16
 * @Description:
 */
public class CustomException extends RuntimeException{

    public CustomException(String message){
        super(message);
    }
}
