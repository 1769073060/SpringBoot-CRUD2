package com.rzk.service;


import com.rzk.mapper.DepartmentMapper;
import com.rzk.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;
    @Override
    public List<Department> queryDepartmentList() {
        return departmentMapper.queryDepartmentList();
    }

    @Override
    public Department queryDepartmentById(int id) {
        return departmentMapper.queryDepartmentById(id);
    }
}
