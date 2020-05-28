package com.rzk.controller;

import com.rzk.mapper.DepartmentMapper;
import com.rzk.mapper.EmployeeMapper;
import com.rzk.pojo.Department;
import com.rzk.pojo.Employee;
import com.rzk.pojo.EmployeeDEP;
import com.rzk.service.DepartmentService;
import com.rzk.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@Controller
public class EmployeeController {


    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private DepartmentService departmentService;
    /*测试*/
    @GetMapping("/queryDepart")
    @ResponseBody
    public List<Department>queryDepartAll(){
        List<Department> departments = departmentService.queryDepartmentList();
        return departments;
    }
    /*测试*/
    @GetMapping("/queryDepartId/{id}")
    @ResponseBody
    public Department queryDepartId(@PathVariable("id") int id){
        Department departmentById = departmentService.queryDepartmentById(id);
        return  departmentById;
    }

    @RequestMapping("/emps")
    public String list(Model model){
        Collection<EmployeeDEP> employees = employeeService.queryEmployeeList();
        model.addAttribute("emps",employees);
        return "emp/list";
    }

    @GetMapping("/emp")
    public String toAddpage(Model model){
        //查出所有部门的信息
        List<Department> departments = departmentService.queryDepartmentList();
        model.addAttribute("departments",departments);
        return "emp/add";
    }


    @PostMapping("/emp")
    public String addEmp(Employee employee){
        System.out.println("employee"+employee);
        //添加的操作
        employeeService.addEmployee(employee);//调用底层业务方法保存员工

        return "redirect:/emps";
    }

    //去到员工修改页面
    @GetMapping("/emp/{id}")
    public String toUpdateEmp(@PathVariable("id") Integer id,Model model){

        Employee employeeById = employeeService.selectEmployeeById(id);
        model.addAttribute("emp",employeeById);
        List<Department> departments = departmentService.queryDepartmentList();
        model.addAttribute("departments",departments);
        return "emp/update";
    }

    @PostMapping("/updateEmp")
    public String updateEmp(Employee employee){
        employeeService.updateEmployee(employee);
        return "redirect:/emps";
    }
    //删除员工
    @GetMapping("/delemp/{id}")
    public String deleteEmp(@PathVariable("id") int id){
        System.out.println("id"+id);
        employeeService.deleteEmployee(id);
        return "redirect:/emps";
    }
}




















