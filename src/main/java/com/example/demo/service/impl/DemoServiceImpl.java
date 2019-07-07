package com.example.demo.service.impl;

import com.example.demo.mapper.DemoMapper;
import com.example.demo.model.RoleModel;
import com.example.demo.service.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author: will.Wang
 * @Version: V-1.0
 * @Date: 2019/3/26 11:47
 * @Description:
 */
@Service
public class DemoServiceImpl implements IDemoService {

    @Autowired
    private DemoMapper demoMapper;

    @Override
    public String sayHello() {
        return "Hello";
    }

    @Override
    public List<RoleModel> getRoleAll() {
        return demoMapper.getRoleAll();
    }

    @Override
    public List<RoleModel> getRoleAllTh() {
        return demoMapper.getRoleAllTh();
    }

    @Override
    public List<Map<String, Object>> getRoleAllT() {
        return demoMapper.getRoleAllT();
    }
}
