package com.liwen.service;
import com.liwen.dao.EmployeeMapper;
import com.liwen.pojo.Employees;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    //调用dao层的操作，设置一个set接口，方便Spring管理
    private EmployeeMapper employeeMapper;

    public void setEmployeeMapper(EmployeeMapper employeeMapper) {
        this.employeeMapper = employeeMapper;
    }

    public int addEmployee(Employees employee) {
        return employeeMapper.addEmployee(employee);
    }

    public int deleteEmployeeById(int id) {
        return employeeMapper.deleteEmployeeById(id);
    }

    public int updateEmployee(Employees employees) {
        return employeeMapper.updateEmployee(employees);
    }

    public Employees queryEmployeeById(int id) {
        return employeeMapper.queryEmployeeById(id);
    }

    public List<Employees> queryAllEmployee() {
        return employeeMapper.queryAllEmployee();
    }

}
