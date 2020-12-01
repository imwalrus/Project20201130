package com.yedam.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for(Entry<String, Integer> ent : entrySet) {
			if(ent.getValue() > maxScore) {
				name = ent.getKey();
				maxScore = ent.getValue();
			}
			totalScore += ent.getValue();
		}
		int avgScore = totalScore / map.size();
		System.out.println("평균점수: " + avgScore);
		System.out.println("최고점수: " + maxScore);
		System.out.println("최고점수를 받은 아이디: " + name);
	}
}
