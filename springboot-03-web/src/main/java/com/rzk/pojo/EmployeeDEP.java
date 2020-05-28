package com.rzk.pojo;

import lombok.Data;

import java.sql.Date;


@Data
public class EmployeeDEP {
    private Integer id;
    private String name;
    private String email;
    private Integer gender;
    private String departmentName;
    private Date date;
}
