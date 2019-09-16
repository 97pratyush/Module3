package org.cg.emp.controller;

import java.util.List;

import org.cg.emp.beans.Employee;
import org.cg.emp.exception.EmployeeException;
import org.cg.emp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeRestAppController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/greet")
	public String sayHello() {
		return "Hello, this is employee app!";
	}

	@RequestMapping("/employees")
	public List<Employee> getEmployees() throws EmployeeException {
		return employeeService.getAllEmployees();
	}

	@GetMapping("/employees/{id}")
	public Employee getEmployeeById(@PathVariable int id) throws EmployeeException {
		return employeeService.getEmployeeById(id);
	}

	@PostMapping("/employees")
	public List<Employee> addEmployee(@RequestBody Employee emp) throws EmployeeException {
		return employeeService.addEmployee(emp);
	}
	
	@DeleteMapping("/employees/{id}")
	public List<Employee> deleteEmployee(@PathVariable int id) throws EmployeeException {
		return employeeService.deleteEmployee(id);
	}
}
