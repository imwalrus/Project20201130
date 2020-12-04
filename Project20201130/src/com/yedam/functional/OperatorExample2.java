package com.yedam.functional;

import java.util.function.IntBinaryOperator;

public class OperatorExample2 {
	private static int[] scores = { 10, 50, 3 };

	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for (int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}

	public static void main(String[] args) {
		// 최대값 얻기
		int max = maxOrMin((a, b) -> {
			return a > b ? a : b;
		});
		System.out.println("최대값: " + max);
		
		// 최소값 얻기
		int min = maxOrMin((a, b) -> {
			int result = 0;
			if(a<b) {
				result = a;
			} else {
				result = b;
			}
			return result;
		});
		System.out.println("최소값: " + min);
	}
}
