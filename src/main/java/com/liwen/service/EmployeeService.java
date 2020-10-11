package com.liwen.service;

import com.liwen.pojo.Employees;
import java.util.List;

//BookService:底下需要去实现,调用dao层
public interface EmployeeService {
    //增加一个employee
    int addEmployee(Employees employee);
    //根据id删除一个Book
    int deleteEmployeeById(int id);
    //更新Book
    int updateEmployee(Employees employees);
    //根据id查询,返回一个Book
    Employees queryEmployeeById(int id);
    //查询全部Book,返回list集合
    List<Employees> queryAllEmployee();
}
