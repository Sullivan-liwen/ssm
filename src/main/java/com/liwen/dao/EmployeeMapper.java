package com.liwen.dao;

import com.liwen.pojo.Employees;
import java.util.List;

public interface EmployeeMapper {

    //增加一个Employee
    int addEmployee(Employees employee);

    //根据id删除一个Employee
    int deleteEmployeeById(int id);

    //更新Employee
    int updateEmployee(Employees employees);

    //根据id查询,返回一个Employee
    Employees queryEmployeeById(int id);

    //查询全部Employee,返回list集合
    List<Employees> queryAllEmployee();

}