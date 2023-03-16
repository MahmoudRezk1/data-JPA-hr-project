package com.global.hr.datajpahrproject.service;

import com.global.hr.datajpahrproject.entity.Employee;
import com.global.hr.datajpahrproject.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;

    public Employee findById(Long id){
        return employeeRepo.findById(id).orElseThrow();
    }
    public Employee insert(Employee employee){
        return employeeRepo.save(employee);
    }
    public Employee update(Employee employee){
        Employee current = employeeRepo.findById(employee.getId()).get();
        current.setName(employee.getName());
        current.setSalary(employee.getSalary());
        current.setDepartment(employee.getDepartment());
        return employeeRepo.save(current);
    }

    public List<Employee> findByDepartment(Long id){
        return employeeRepo.findByDepartmentId(id);
    }
}
