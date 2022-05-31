package com.boot.rest.service;

import java.util.List;

import com.boot.rest.model.Employee;

public interface EmployeeService {
	
	public Employee saveEmployee(Employee emp);
	public List<Employee> getAllEmployees();
	public Integer update(Integer emp_id, Double salary);
	public Employee getEmployeeById(Integer emp_id);
	public String deleteEmployeeById(Integer id);

}
