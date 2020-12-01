package com.yedam.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample2 {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();
		map.put(new Student(101, "윤태현"), 80);
		map.put(new Student(102, "정병기"), 90);
		map.put(new Student(201, "김종인"), 70);
		map.put(new Student(201, "김종인"), 80);
		map.put(new Student(103, "정병기"), 88);

		// 1. keySet()
		Set<Student> set = map.keySet();
		for (Student student : set) {
			System.out.println("학번: " + student.getStudentNo() + ", 이름: " + student.getStudentName() + ", 점수: "
					+ map.get(student));
		}

		// 2. entrySet()
		int totalScore = 0;
		Set<Entry<Student, Integer>> entrySet = map.entrySet();
		for (Entry<Student, Integer> ent : entrySet) {
			totalScore += ent.getValue();
		}
		System.out.println("평균점수: " + totalScore / map.size());
	}
}
