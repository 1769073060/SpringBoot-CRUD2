package com.rzk.service;


import com.rzk.pojo.Department;

import java.util.List;


public interface DepartmentService {
    List<Department> queryDepartmentList();

    Department queryDepartmentById(int id);
}
