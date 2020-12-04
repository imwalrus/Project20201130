package com.yedam.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample2 {
	private static List<Students> list = Arrays.asList( //
			new Students("Hong", "M", 90), //
			new Students("Hwang", "F", 90), //
			new Students("Kim", "M", 82), //
			new Students("Lee", "F", 82), //
			new Students("Park", "F", 80)); //

	public static double avg(Predicate<Students> predicate) {
		int count = 0, sum = 0;
		for (Students student : list) {
			if (predicate.test(student)) {
				count++;
				sum += student.getScore();
			}
		}
		return (double) sum / count;
	}

	public static void main(String[] args) {
		double mAvg = avg(t -> t.getSex().equals("M"));
		System.out.println("Male Average: " + mAvg);

		double fAvg = avg(t -> t.getSex().equals("F"));
		System.out.println("Female Average: " + fAvg);
	}
}
