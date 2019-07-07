package com.example.demo;

import com.example.demo.enums.WeekEnum;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: PengXiang.Wang
 * @Version: V-1.0
 * @Date: 2019/3/27 14:52
 * @Description: 测试 Demo
 */
public class TestDemo {

    /**
     * 枚举测试
     */
    @Test
    public void test1() {
        System.out.println(WeekEnum.getWeekEnumDayNameFromDayId(1));
    }

    /**
     * Lambda
     */
    @Test
    public void test2() {
        String[] atp = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer","Roger Federer",
                "Andy Murray","Tomas Berdych",
                "Juan Martin Del Potro"};
        List<String> players =  Arrays.asList(atp);
        // 以前的循环方式
        /*for (String player : players) {
            System.out.print(player + "; ");
        }*/

        // 使用 lambda 表达式以及函数操作(functional operation)
        players.forEach((player) -> System.out.print(player + "; "));

        // 在 Java 8 中使用双冒号操作符(double colon operator)
        //players.forEach(System.out::println);

    }
}
