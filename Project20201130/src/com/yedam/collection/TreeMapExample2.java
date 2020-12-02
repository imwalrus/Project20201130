package com.yedam.collection;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapExample2 {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(87, "Hong");
		scores.put(98, "Hwang");
		scores.put(75, "Choi");
		scores.put(95, "Park");
		scores.put(80, "Kim");
		System.out.println("scores: 첫번째 " + scores.firstEntry().getKey());

		NavigableMap<Integer, String> navigableMap = scores.descendingMap();
		System.out.println("navigableMap: 첫번째 " + navigableMap.firstEntry().getKey());

		NavigableSet<Integer> nSet = scores.descendingKeySet();
		System.out.println("scores: 첫번째 " + scores.firstKey());
		System.out.println("nSet: 첫번째 " + nSet.first());

		// {34, 55, 26, 48, 77}
		int intAry[] = { 34, 55, 26, 48, 77 };
		TreeSet<Integer> aSet = new TreeSet<Integer>();
		for (int i = 0; i < intAry.length; i++) {
			aSet.add(intAry[i]);
		}
		for (int i = 0; i < intAry.length; i++) {
			intAry[i] = aSet.pollFirst();
		}
		for (int i = 0; i < intAry.length; i++) {
			System.out.println(intAry[i]);
		}
	}
}