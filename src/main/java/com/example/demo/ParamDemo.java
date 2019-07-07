package com.example.demo;

import com.example.demo.excption.ParamException;

/**
 * @Author: will.Wang
 * @Version: V-1.0
 * @Date: 2019/3/27 14:52
 * @Description: 自定义参数测试
 */
public class ParamDemo {

    /**
     * 自定义参数测试
     * @param args
     */
    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println("1111111111");
        d.demoTest();
        System.out.println("2222222222");
    }

}

class Demo {

    void demoTest() {
        throw new ParamException("这是一个自定义异常", 1);

    }
}