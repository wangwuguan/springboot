package com.example.demo.service;

import com.example.demo.model.RoleModel;

import java.util.List;
import java.util.Map;

public interface IDemoService {

    String sayHello();

    List<RoleModel> getRoleAll();

    List<RoleModel> getRoleAllTh();

    List<Map<String, Object>> getRoleAllT();
}
