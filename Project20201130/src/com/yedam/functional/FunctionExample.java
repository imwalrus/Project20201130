package com.yedam.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

public class FunctionExample {
	public static List<Student> list = Arrays.asList(new Student("Hong", 90, 96), new Student("Hwang", 95, 93));

	public static void printString(Function<Student, String> func) {
		for (Student student : list) {
			System.out.println(func.apply(student));
		}
	}

								 // (Function<Student, Integer> func) //
	public static void printInt(ToIntFunction<Student> func) {
		for (Student student : list) {
			System.out.println(func.applyAsInt(student));
		}
	}

	public static double avg(ToDoubleFunction<Student> func) {
		double result = 0, sum = 0;
		for (Student student : list) {
			result = func.applyAsDouble(student);
			sum += result;
		}
		return sum / list.size();
	}

	public static void main(String[] args) {
		System.out.println("[영어평균]");
		double avg = avg(new ToDoubleFunction<Student> () {
			@Override
			public double applyAsDouble(Student value) {
				return value.getEngScore();
			}
		});
		System.out.println("Result: " + avg);
		
		System.out.println("[합계점수]");
		printInt(new ToIntFunction<Student>() {
			@Override
			public int applyAsInt(Student value) {
				return value.getEngScore() + value.getMathScore();
			}
		});

		System.out.println("[영어점수]");
		printInt(new ToIntFunction<Student>() {
			@Override
			public int applyAsInt(Student value) {
				return value.getEngScore();
			}
		});
		
		System.out.println("[학생이름] - [영어점수]");
		printString(new Function<Student, String>() {
			@Override
			public String apply(Student t) {
				return t.getName() + " " + t.getEngScore();
			}
		});

		System.out.println("------------------------------------------------");

		Function<String, Integer> func = null;
		func = t -> t.length();
		System.out.println(func.apply("Hello"));

		BiFunction<Integer, String, String> biFunc = (num, str) -> String.valueOf(num) + str;
		String result = biFunc.apply(5, "678");
		System.out.println(result);

	}
}
