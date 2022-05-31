package com.boot.rest.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.rest.model.Employee;
import com.boot.rest.repo.EmployeeRepository;
import com.boot.rest.service.EmployeeService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EmployeeServiceimpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public Employee saveEmployee(Employee emp) {
		log.info("calling emp repo to store an employee record");
		System.out.println(emp);
		return empRepo.save(emp);
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return (List<Employee>) empRepo.findAll();
	}

	@Override
	public Integer update(Integer emp_id, Double salary) {
		
		int count = empRepo.updateById(emp_id, salary);
		return count;
	}

	@Override
	public Employee getEmployeeById(Integer emp_id) {
		
		Optional<Employee> empOptional = empRepo.findById(emp_id);
		if(empOptional.isPresent()) {
			return empOptional.get();
		}
		return null;
	}

	@Override
	public String deleteEmployeeById(Integer id) {
		empRepo.deleteById(id);
		return "The employee record deleted Successfully...!";
		
	}
	
	
	
	

}
