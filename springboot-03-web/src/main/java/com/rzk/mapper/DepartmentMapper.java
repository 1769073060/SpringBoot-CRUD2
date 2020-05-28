package com.rzk.mapper;

import com.rzk.pojo.Department;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//这个注解表示了这是一个mybatis的mapper类； dao
@Mapper
@Repository
public interface DepartmentMapper {

    List<Department> queryDepartmentList();

    Department queryDepartmentById(int id);
}
