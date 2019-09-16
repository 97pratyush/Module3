package org.cg.emp.service;

import java.util.List;

import org.cg.emp.beans.Employee;
import org.cg.emp.dao.EmployeeRepository;
import org.cg.emp.exception.EmployeeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployees() throws EmployeeException {
		try {
			return employeeRepository.findAll();
		} catch (Exception e) {
			throw new EmployeeException(e.getMessage());
		}
	}

	@Override
	public List<Employee> addEmployee(Employee emp) throws EmployeeException {
		if(employeeRepository.existsById(emp.getId()))
			throw new EmployeeException("Employee with Id " + emp.getId() + " doesn't exist.");
		
		employeeRepository.save(emp);
		return getAllEmployees();
	}

	@Override
	public List<Employee> deleteEmployee(int id) throws EmployeeException {
		if(employeeRepository.existsById(id))
			throw new EmployeeException("Employee with Id " + id + " doesn't exist.");
		employeeRepository.deleteById(id);
		return getAllEmployees();
	}

	@Override
	public List<Employee> updateEmployee(Employee emp) throws EmployeeException {

		return null;
	}

	@Override
	public Employee getEmployeeById(int id) throws EmployeeException {
		if (!employeeRepository.existsById(id))
			throw new EmployeeException("Employee with Id " + id + " doesn't exist.");

		return employeeRepository.findById(id).get();
	}

}
