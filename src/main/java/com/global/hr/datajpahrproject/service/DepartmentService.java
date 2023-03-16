package com.global.hr.datajpahrproject.service;

import com.global.hr.datajpahrproject.entity.Department;
import com.global.hr.datajpahrproject.entity.Employee;
import com.global.hr.datajpahrproject.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepo departmentRepo;
    public List<Department> findAll(){
        return departmentRepo.findAll();
    }

    public Department findById(Long id){
        return departmentRepo.findById(id).orElseThrow();
    }
    public Department insert(Department department){
        return departmentRepo.save(department);
    }
    public Department update(Department department){
        Department current = departmentRepo.findById(department.getId()).get();
        current.setName(department.getName());
        return departmentRepo.save(current);
    }
}
