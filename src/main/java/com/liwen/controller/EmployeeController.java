package com.liwen.controller;

import com.liwen.pojo.Employees;
import com.liwen.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    @Qualifier("EmployeeServiceImpl")
    private EmployeeService employeeService;

    @RequestMapping("/allEmployee")
    public String list(Model model) {
        List<Employees> list = employeeService.queryAllEmployee();
        model.addAttribute("list", list);
        return "allEmployee";
    }

    @RequestMapping("/toAddEmployee")
    public String toAddPaper() {
        return "addEmployee";
    }

    @RequestMapping("/addEmployee")
    public String addPaper(Employees employees) {
        System.out.println(employees);
        employeeService.addEmployee(employees);
        return "redirect:/employee/allEmployee";
    }

    @RequestMapping("/toUpdateEmployee")
    public String toUpdateEmployee(Model model, int id) {
        Employees employees = employeeService.queryEmployeeById(id);
        System.out.println(employees);
        model.addAttribute("employee",employees );
        return "updateEmployee";
    }

    @RequestMapping("/updateEmployee")
    public String updateEmployee(Model model, Employees employees) {
        System.out.println(employees);
        int i = employeeService.updateEmployee(employees);
//        Books books = bookService.queryBookById(book.getBookID());
//        model.addAttribute("books", books);
        if(i > 0){
            System.out.println("添加employees成功"+employees);
        }
        return "redirect:/employee/allEmployee";
    }

    @RequestMapping("/del/{employeesId}")
    public String deleteEmployee(@PathVariable("employeesId") int id) {
        employeeService.deleteEmployeeById(id);
        return "redirect:/employee/allEmployee";
    }
}
