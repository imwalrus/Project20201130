package com.yedam.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapExample3 {
	public static void main(String[] args) {
		Set<Employee> set = new HashSet<>();
		set.add(new Employee(101, "Hong", "HONG", 1000));
		set.add(new Employee(102, "Hwang", "HWANG", 2000));
		set.add(new Employee(103, "Park", "PARK", 3000));
		set.add(new Employee(104, "Choi", "CHOI", 4000));
		
		// ID, LAST NAME
		Map<Integer, String> map = new HashMap<>();
		for (Employee emp : set) {
			map.put(emp.getEmployeeId(), emp.getLastName());
			System.out.println("ID: " + emp.getEmployeeId() + ", Name: " + emp.getLastName());
		}
		
		// EMAIL, SALARY
		Map<String, Integer> map1 = new HashMap<>();
		for(Employee emp : set) {
			map1.put(emp.getEmail(), emp.getSalary());
			System.out.println("Email: " + emp.getEmail() + ", Salary: " + emp.getSalary());
		}
	}
}
