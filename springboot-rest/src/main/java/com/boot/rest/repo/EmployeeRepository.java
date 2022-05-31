package com.boot.rest.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.boot.rest.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
	
	@Modifying
	@Transactional
	@Query(value = "Update Employee e  set e.emp_sal =:emp_sal where e.empi_id =:emp_id ", nativeQuery = true)
	public Integer updateById(@Param("emp_id") Integer emp_id, @Param("emp_sal") Double salary);

}
