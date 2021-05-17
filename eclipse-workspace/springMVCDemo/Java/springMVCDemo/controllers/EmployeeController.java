package springMVCDemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import springMVCDemo.model.Employee;
import springMVCDemo.services.EmployeeServiceImpl;


@Controller
public class EmployeeController {
	@Autowired
	EmployeeServiceImpl eserv;
	
	@RequestMapping("/welcome")
	public ModelAndView showHome()
	{
		ModelAndView mv=new ModelAndView("home");
		mv.addObject("message", "Welcome to Capgemini!!!");
		return mv;
	}
	@RequestMapping("/addEmployee")
	public String addEmployee(Employee e)
	{
		return "createE";
	}
	
	@RequestMapping("/readEmployees")
	public ModelAndView readEmployees()
	{
		ModelAndView mv=new ModelAndView("readE");
		List<Employee> elist=eserv.readEmployees();
		mv.addObject("elist", elist);
		return mv;
	}
	
	@RequestMapping("/updateEmployee")
	public String updateEmployee()
	{
		return "updateE";
	}
	
	@RequestMapping("/deleteEmployee")
	public String deleteEmployee()
	{
		return "deleteE";
	}
	
	@RequestMapping("/createE")
	public ModelAndView createE(@RequestParam int eid,@RequestParam String ename,@RequestParam int esalary)
	{
		ModelAndView mv=new ModelAndView("createE");
		int id=eserv.createEmployee(new Employee(eid,ename,esalary));
		mv.addObject("message","Employee with "+id+"has been added successfully");
		return mv;
	}
	@RequestMapping("/deleteE")
	public ModelAndView deleteE(@RequestParam("eid") int eid)
	{
		ModelAndView mv=new ModelAndView("deleteE");
		int id=eserv.deleteEmployee(eid);
		if(id!=-1)
			mv.addObject("message", "Employee with id "+id+"has been deleted successfully!!!");
		else
			mv.addObject("message", "Employee with id "+id+"not found!!!");
		return mv;
	}
	@RequestMapping("/updateE")
	public ModelAndView updateE(@RequestParam("eid") int eid, @RequestParam("ename") String ename,@RequestParam("esalary") int esalary)
	{
		ModelAndView mv=new ModelAndView("updateE");
		int id=eserv.updateEmployee(new Employee(eid,ename,esalary), eid);
		if(id!=-1)
			mv.addObject("message", "Employee with id "+id+"has been updated successfully!!!");
		else
			mv.addObject("message", "Employee with id "+id+"not found!!!");
		return mv;
	}
}
