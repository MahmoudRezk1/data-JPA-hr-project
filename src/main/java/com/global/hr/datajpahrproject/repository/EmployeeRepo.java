package com.global.hr.datajpahrproject.repository;

import com.global.hr.datajpahrproject.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long> {
    List<Employee> findByDepartmentId (Long id);

}
