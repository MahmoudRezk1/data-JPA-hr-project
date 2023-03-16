package com.global.hr.datajpahrproject.repository;

import com.global.hr.datajpahrproject.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo extends JpaRepository<Department,Long> {
}
