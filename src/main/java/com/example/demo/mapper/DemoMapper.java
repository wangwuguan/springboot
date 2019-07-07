package com.example.demo.mapper;

import com.example.demo.model.RoleModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;
import java.util.Map;

@Mapper
public interface DemoMapper {

    String CLOUMNS = "id, name, type, status, remark, operator, operate_time, operate_ip";

    @Select("select " + CLOUMNS + " from tbl_demo_role")
    @ResultMap(value="com.example.demo.mapper.DemoMapper.DemoModelMap")
    List<RoleModel> getRoleAll();

    @Select("select " + CLOUMNS + " from tbl_demo_role")
    List<Map<String, Object>> getRoleAllT();

    @SelectProvider(type = com.example.demo.provider.DemoProvider.class, method = "selectRoleAllTh")
    @ResultMap(value="com.example.demo.mapper.DemoMapper.DemoModelMap")
    List<RoleModel> getRoleAllTh();

}
