package org.cg.emp.service;

import java.util.List;

import org.cg.emp.beans.Employee;
import org.cg.emp.exception.EmployeeException;

public interface EmployeeService {

	List<Employee> getAllEmployees() throws EmployeeException;
	List<Employee> addEmployee(Employee emp) throws EmployeeException;
	List<Employee> deleteEmployee(int id) throws EmployeeException;
	List<Employee> updateEmployee(Employee emp) throws EmployeeException;
	Employee getEmployeeById(int id) throws EmployeeException;
}
