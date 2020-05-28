package com.rzk.service;

import com.rzk.pojo.Employee;
import com.rzk.pojo.EmployeeDEP;

import java.util.List;


public interface EmployeeService {
    //查询全部员工信息
    List<EmployeeDEP> queryEmployeeList();
    //根据id查询员工信息
    Employee selectEmployeeById(int id);
    //添加一个员工信息
    int addEmployee(Employee employee);
    //修改一个员工信息
    int updateEmployee(Employee employee);
    //删除员工信息
    int deleteEmployee(int id);
}
