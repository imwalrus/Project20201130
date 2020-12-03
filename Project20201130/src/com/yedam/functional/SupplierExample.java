package com.yedam.functional;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierExample {
	public static void main(String[] args) {
		// 매개값 X -> 반환값 O
		Supplier<String> sup = () -> {
			return "Hello";
		};
		System.out.println(sup.get());

		Supplier<Integer> intSup = () -> {
			int result = 35 * 20;
			return result;
		};
		System.out.println(intSup.get());

		IntSupplier intSupp = () -> {
			int num = (int) (Math.random() * 6) + 1;
			return num;
		};
		System.out.println(intSupp.getAsInt());
	}
}
