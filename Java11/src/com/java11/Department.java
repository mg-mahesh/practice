package com.java11;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Department {

	public static void main(String[] args) {

		List<Department> deptList = new ArrayList<>();
		deptList.add(new Department(1, "IT"));
		deptList.add(new Department(2, "HR"));
		deptList.add(new Department(3, "Management"));
		deptList.add(new Department(4, "Development"));
		deptList.add(new Department(5, "Recruitment"));
		
		
		Map<Integer, String> deptMap = deptList.stream()
				.collect(Collectors
						.toMap(Department::getDeptId,
								Department::getDeptName));
		deptMap.forEach((k, v)
				-> System.out.println("DeptId ("+ k +") Name : " + v));
	
		System.out.println();
		
		Date date  = new Date();
		LocalDate localDate = date.toInstant().atZone(ZoneId
				.systemDefault()).toLocalDate();
		System.out.println(localDate);
		System.out.println();
		localDate = Instant.ofEpochMilli(date.getTime())
				.atZone(ZoneId.systemDefault()).toLocalDate();
		System.out.println(localDate);
		System.out.println();
		localDate = LocalDate.parse(new 
				SimpleDateFormat("yyyy-MM-dd").format(date));
		System.out.println(localDate);
		
		Long count = deptList.stream().count();
		System.out.println();
		System.out.println(count);
		
		 Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
	        Long count1 = stream.filter(num->(num%2)==0).count();
	        System.out.println(count1);
	        System.out.println();
	        
	        Stream<Integer> stream1 = Stream.of(1,2,3,4,5,6);
	        Long count3 = stream1.collect(Collectors.counting());
	        System.out.println(count3);
	        System.out.println();
	        
	        Parcel amazon = new Parcel("amazon", "Laptop", "Phone");
	        Parcel ebay = new Parcel("ebay", "Mouse", "KeyBoard");
	        List<Parcel> parcels = Arrays.asList(amazon, ebay);
	        System.out.println("----------- Without flatMap()  ----------");
	     List<List<String>> map = parcels.stream().map(Parcel::getItems)
	        	.collect(Collectors.toList());
	     System.out.println(map);
	     
	     System.out.println("--------------- With flatMap() --------");
	       List<String> flatMap = parcels.stream().map(Parcel::getItems)
	        .flatMap(Collection::stream)
	        .collect(Collectors.toList());
	        System.out.println(flatMap);
	        
	        System.out.println();
	        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
	        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3));
	      // list1.retainAll(list2);
	        System.out.println(list1);
	        System.out.println();
	        List<Integer> result = list1.stream().distinct()
	        		.filter(list2::contains)
	        		.collect(Collectors.toList());
	        //result.forEach(System.out::println);
	        System.out.println(result);
	        System.out.println();
	        List<Integer> finalList =  list1.stream()
	        		.filter(item-> !list2.contains(item))
	        		.collect(Collectors.toList());
	        System.out.println(finalList);
	        System.out.println();
	        
	        Stream<String> streamx = Stream.of("1", "2", "3", "A");
	        Stream<String> streamy = Stream.of("A", "B", "C", "1");
	       // Stream<String> streamxy = Stream.concat(streamy, streamx);
	       // System.out.println(streamxy.collect(Collectors.toList()));
	       // System.out.println("multiple streams");
	        Stream<String> streamz = Stream.of("P", "Q", "R", "B", "3");
	        Stream<String> streamxzy = Stream.concat(Stream
	        		.concat(streamx, streamy), streamz);
	       // System.out.println(streamxzy.collect(Collectors.toList()));
	        System.out.println("removing duplicates");
	        System.out.println(streamxzy.distinct().collect(Collectors.toList()));
	        
	        
	        
	        
	        
	}

	private Integer deptId;
	private String deptName;

	public Department() {

	}

	public Department(Integer deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}
	
	public Integer getDeptId() {
		return deptId;
	}
	
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	
	public String getDeptName() {
		return deptName;
	}
	
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

}

class Parcel{
	String name;
	List<String> items;
	
	public Parcel() {}
	
	public Parcel(String name, String... items) {
		this.name = name;
		this.items = Arrays.asList(items);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<String> getItems(){
		return items;
	}
	
	public void setItems(String... items) {
		this.items = Arrays.asList(items);
	}
}
