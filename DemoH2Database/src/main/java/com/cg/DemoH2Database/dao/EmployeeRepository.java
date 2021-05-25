package com.cg.DemoH2Database.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.DemoH2Database.dto.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
