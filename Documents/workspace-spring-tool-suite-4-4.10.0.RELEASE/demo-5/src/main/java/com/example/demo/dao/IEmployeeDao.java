package com.example.demo.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;
@Repository("edao")
public interface IEmployeeDao extends JpaRepository<Employee, Integer> {
	
	
}
