package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;
import com.example.demo.exceptions.IDNotFoundException;

@Repository("edao")
public class EmployeeDaoImpl implements IEmployeeDao {
	List<Employee> elist;
	public EmployeeDaoImpl()
	{
		elist=new ArrayList<Employee>();
		elist.add(new Employee(101,"Ronit",67000));
		elist.add(new Employee(102,"Rohit",56000));
		elist.add(new Employee(103,"Rita",90000));
		elist.add(new Employee(104,"Neha",67000));
		elist.add(new Employee(105,"Mohit",85000));
	}
	public int createEmployee(Employee e) {
		elist.add(e);
		return e.getEid();
	}
	public List<Employee> readEmployees() {
		return elist;
	}
	public int updateEmployee(Employee e, int eid) {
		int index=-1;
		for(Employee e1:elist)
		{
			if(e1.getEid()==eid)
			{
				index=elist.indexOf(e1);
				elist.remove(index);
				break;
			}
		}
		if(index>=0)
		{
			elist.add(index, e);
			return eid;
		}
		else
			throw new IDNotFoundException(eid+" is not present");
	}
	public int deleteEmployee(int eid) {
		int flag=0;
		for(Employee e1:elist)
		{
			if(e1.getEid()==eid)
			{
				flag=1;
				elist.remove(e1);
				break;
			}
		}
		if(flag==0)
			throw new IDNotFoundException(eid+" is not present");
		else
			return eid;
	}
	public Employee readEmployee(int eid) {
		
		for(Employee e1:elist)
		{
			if(e1.getEid()==eid)
			{
				return e1;
			}
		}
		
			throw new IDNotFoundException(eid+" is not present");
	}
}
