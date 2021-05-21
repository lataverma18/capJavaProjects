package com.example.demo.controllers;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("This is Employee Model")
public class Employee {
@ApiModelProperty("This is employee id property")
	private int eid;
@ApiModelProperty("This is employee name property")
	private String ename;
@ApiModelProperty("This is employee salary property")
	private int esalary;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEsalary() {
		return esalary;
	}
	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}
	public Employee(int eid, String ename, int esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}
	public Employee() {
	}
}
