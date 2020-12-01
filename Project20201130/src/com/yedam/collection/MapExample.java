package com.yedam.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Hong", 15);
		map.put("Hwang", 20);
		map.put("Lee", 20);

		Integer val = map.get("Hong");
		System.out.println(val);

		System.out.println();
		Set<String> set = map.keySet();
		for (String key : set) {
			System.out.println("key: " + key + ", val: " + map.get(key));
		}

		System.out.println();
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> ent : entrySet) {
			System.out.println("key: " + ent.getKey() + ", val: " + ent.getValue());
		}

		Map<Integer, String> mapInt = new HashMap<>();
		mapInt.put(10, "김다현");
		mapInt.put(20, "이혜빈");
		mapInt.put(30, "이나경");

		System.out.println();
		String result = mapInt.get(10);
		System.out.println(result);

		System.out.println();
		Set<Integer> set1 = mapInt.keySet();
		for (Integer num : set1) {
			System.out.println("key: " + num + ", val: " + mapInt.get(num));

		}
		System.out.println();
		Set<Entry<Integer, String>> entrySet1 = mapInt.entrySet();
		for (Entry<Integer, String> ent1 : entrySet1) {
			System.out.println("key: " + ent1.getKey() + ", val: " + ent1.getValue());
		}
	}
}
