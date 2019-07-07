package com.example.demo.controller;

import com.example.demo.model.RoleModel;
import com.example.demo.service.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @Author: will.Wang
 * @Version: V-1.0
 * @Date: 2019/3/26 11:44
 * @Description: 测试 SpringBoot
 */
@Controller
public class DemoController {

    @Autowired
    private IDemoService demo;

    /**
     * 测试
     * @return String
     */
    @RequestMapping("/tosay")
    @ResponseBody
    public String sayHello(){
        return demo.sayHello();
    }

    /**
     * 查询角色信息
     * @return List<RoleModel> 所有角色记录
     */
    @RequestMapping("/list")
    @ResponseBody
    public List<RoleModel> getRoleAll(){
        return demo.getRoleAll();
    }

    /**
     * 查询角色信息
     * @return List<RoleModel> 所有角色记录
     */
    @RequestMapping("/listTh")
    @ResponseBody
    public List<RoleModel> getRoleAllTh(){
        return demo.getRoleAllTh();
    }

    /**
     * 查询角色信息
     * @return List<Map<String, Object>> 所有角色记录
     */
    @RequestMapping("/listT")
    @ResponseBody
    public List<Map<String, Object>> getRoleAllT(){
        return demo.getRoleAllT();
    }

}
