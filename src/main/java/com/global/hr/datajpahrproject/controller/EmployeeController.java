package com.global.hr.datajpahrproject.controller;

import com.global.hr.datajpahrproject.entity.Employee;
import com.global.hr.datajpahrproject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path = "/findById")
    public Employee findById(@RequestParam Long id){
        return employeeService.findById(id);
    }
    @PutMapping(path = "/update")
    public Employee update(@RequestBody Employee employee){
        return employeeService.update(employee);
    }
    @PostMapping(path = "/insert")
    public Employee insert(@RequestBody Employee employee){
        return employeeService.insert(employee);
    }
    @GetMapping(path = "/findByDepartment")
    public List<Employee> findByDepartment(@RequestParam  Long id){
        return employeeService.findByDepartment(id);
    }
}
