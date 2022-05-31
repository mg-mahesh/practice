package com.boot.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.rest.model.Employee;
import com.boot.rest.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee emp) {
		
		return empService.saveEmployee(emp);
	}
	
	@GetMapping("/getAll")
	public List<Employee> getAllEmployees(){
		return empService.getAllEmployees();
	}
	
	@PutMapping("/updateByID/{emp_id}/{salary}")
	public String updateEmployee(@PathVariable("emp_id") Integer emp_id,
			@PathVariable("salary") Double salary) {
		int count = empService.update(emp_id, salary);
		return String.valueOf(count).concat(" updated Successfully");
	}
	
	@GetMapping("/getById/{id}")
	public Employee getById(@PathVariable("id") Integer id) {
		return empService.getEmployeeById(id);
	}
	
	@DeleteMapping("deleteById/{id}")
	public String deleteEmpById(@PathVariable("id") Integer id) {
		 String deleteMsg = empService.deleteEmployeeById(id);
		 return deleteMsg;
	}
	
}
