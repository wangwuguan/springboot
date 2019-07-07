package com.example.demo.model;

import lombok.*;

/**
 * @Author: will.Wang
 * @Version: V-1.0
 * @Date: 2019/3/28 14:37
 * @Description:
 */

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class RoleModel {

    private Integer id;
    private String name;
    private Integer type;
    private Integer status;
    private String remark;
    private String operator;
    private String operateTime;
    private String operateIP;
}
