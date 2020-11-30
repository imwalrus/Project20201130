package com.yedam.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample1 {
	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(15);
		numbers.add(20);
		numbers.add(25);
		numbers.add(30);
		numbers.add(35);
		numbers.add(40);
		numbers.add(20);
		numbers.add(25);

		int sum1 = 0;
		for (Integer i : numbers) {
			sum1 += i;
		}
		System.out.println("전체 합: " + sum1);

		Set<Integer> numbers2 = new HashSet<>();
		numbers2.add(10);
		numbers2.add(15);
		numbers2.add(20);
		numbers2.add(25);
		numbers2.add(30);
		numbers2.add(35);
		numbers2.add(40);
		numbers2.add(20);
		numbers2.add(25);

		int sum2 = 0;
		for (Integer j : numbers2) {
			sum2 += j;
		}
		System.out.println("중복된 값을 제외한 합: " + sum2);
	}
}
