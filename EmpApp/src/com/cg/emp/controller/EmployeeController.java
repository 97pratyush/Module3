package com.cg.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.emp.beans.Employee;
import com.cg.emp.exception.EmployeeException;
import com.cg.emp.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "greet";
	}
	
	@RequestMapping("/")
	public ModelAndView getEmployees() {
		ModelAndView mv;
		try {
			List<Employee> employees = employeeService.getAllEmployees();
			mv = new ModelAndView("index");
			mv.addObject("employees", employees);
		} catch (EmployeeException e) {
			mv = new ModelAndView("error");
			mv.addObject("error", e);
		}
		return mv;
	}
	
	@RequestMapping("/delete")
	public ModelAndView deleteEmployee(@RequestParam int id) {
		ModelAndView mv;
		try {
			List<Employee> employees = employeeService.deleteEmployee(id);
			mv = new ModelAndView("index");
			mv.addObject("employees", employees);
		} catch (EmployeeException e) {
			mv = new ModelAndView("error");
			mv.addObject("error", e);
		}
		return mv;
	}
}
