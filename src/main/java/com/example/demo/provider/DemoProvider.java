package com.example.demo.provider;

import java.io.Serializable;

/**
 * @Author: will.Wang
 * @Version: V-1.0
 * @Date: 2019/3/28 16:13
 * @Description:
 */
public class DemoProvider implements Serializable {

    /**
     * 查询所有的角色信息
     * @return
     */
    public String selectRoleAllTh() {
        StringBuffer sql = new StringBuffer("select * from tbl_demo_role");
        sql.append(" where 1 = 1");
        return sql.toString();
    }


}
