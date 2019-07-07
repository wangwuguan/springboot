package com.example.demo.excption;

/**
 * @Author: will.Wang
 * @Version: V-1.0
 * @Date: 2019/3/28 11:41
 * @Description: 自定义参数异常
 */
@SuppressWarnings("ALL")
public class ParamException extends RuntimeException{

    private int value;

    public ParamException () {
        super();
    }

    public ParamException (String msg, int value) {
        super(msg);
        this.value = value;
    }

    public int getValue () {
        return value;
    }
}

