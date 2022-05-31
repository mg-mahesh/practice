package com.java11;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Emp {
	
	private Integer id;
	private Integer dept;
	private String name;
	
	public Emp(Integer id, Integer dept, String name) {
		super();
		this.id = id;
		this.dept = dept;
		this.name = name;
	}
	
	public Emp() {
		
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getDept() {
		return dept;
	}
	
	public void setDept(Integer dept) {
		this.dept = dept;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", dept=" + dept + ", name=" + name + "]";
	}

	
	public static void main(String[] args) {
		
		Emp e1 = new Emp();
		e1.setId(101);
		e1.setDept(1011);
		e1.setName("Mahesh");
		
		Emp e2 = new Emp();
		e2.setId(102);
		e2.setDept(1012);
		e2.setName("Suresh");
		
		Emp e3 = new Emp();
		e3.setId(103);
		e3.setDept(1012);
		e3.setName("Naresh");
		
		Emp e4 = new Emp();
		e4.setId(104);
		e4.setDept(1012);
		e4.setName("Rupesh");
		
		Emp e5 = new Emp();
		e5.setId(105);
		e5.setDept(1012);
		e5.setName("Nagesh");
		
		Emp e6 = new Emp();
		e6.setId(106);
		e6.setDept(1013);
		e6.setName("Ramesh");
		
		List<Emp> employeeList = new ArrayList<>();
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(e5);
		employeeList.add(e6);
		
		Map<Integer, List<Emp>> byDept = employeeList.stream().collect(Collectors.groupingBy(Emp::getDept));
		byDept.forEach((k, v) -> System.out.println("DeptId:" +k +"   " +
				   ((List < Emp > ) v).stream().map(m -> m.getName())
				   .collect(Collectors.joining(","))));
		
		System.out.println(byDept);
		
		byDept.forEach((k, v) -> System.out.println("DeptId:" + k + "   " +
					((List<Emp>) v) .stream().map(m -> m.getName()).collect(Collectors.joining(", "))));
	}

}
