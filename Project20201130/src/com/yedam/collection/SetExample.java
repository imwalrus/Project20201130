package com.yedam.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Hello");
		set.add("World");
		set.add("World");
		set.add("Welcome");

//		for (String str : set) {
//			System.out.println(str);
//		}

		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}

		Set<Integer> numbers = new HashSet<>();
		numbers.add(13);
		numbers.add(26);
		numbers.add(26);
		numbers.add(38);

		numbers.remove(26);

		int sum = 0;
		for (Integer i : numbers) {
			sum += i;
		}
		System.out.println("numbers: " + sum);
	}
}
