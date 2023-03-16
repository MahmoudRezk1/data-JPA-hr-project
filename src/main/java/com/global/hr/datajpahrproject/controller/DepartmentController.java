package com.global.hr.datajpahrproject.controller;

import com.global.hr.datajpahrproject.entity.Department;
import com.global.hr.datajpahrproject.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @GetMapping(path = "/findAll")
    public List<Department> findAll(){
        return departmentService.findAll();
    }
    @GetMapping(path = "/findById")
    public Department findById(@RequestParam Long id){
        return departmentService.findById(id);
    }
    @PostMapping(path = "/insert")
    public Department insert(@RequestBody Department department){
        return departmentService.insert(department);
    }
    @PutMapping(path = "/update")
    public Department update(@RequestBody Department department){
        return departmentService.update(department);
    }
}
