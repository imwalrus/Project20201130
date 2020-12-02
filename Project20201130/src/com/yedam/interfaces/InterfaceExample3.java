package com.yedam.interfaces;

interface MyFunctionalInterface {
	public void run(double radius, double pi);
}

interface MyFunctionalInterface2 {
	public void run(double base, double alt);
}

interface MyFunctionalInterface3 {
	public void run(double length);
}

public class InterfaceExample3 {
	public static void main(String[] args) {
		// 1. 화면출력(원의 넓이를 구하는 기능 구현)
		MyFunctionalInterface cArea = (radius, pi) -> {
			double result =  radius * radius * pi;
			System.out.println("원의 넓이: " + result);
		};
		cArea.run(5, 3.14); // 원의 반지름, 𝞹
		// 2. 화면출력(밑변으로 가지는 삼각형의 넓이 구하는 기능 구현)
		MyFunctionalInterface2 tArea = (base, alt) -> {
			double result =  (base * alt) / 2;
			System.out.println("삼각형의 넓이: " + result);
		};
		tArea.run(5, 3); // 밑변, 높이
		// 3. 화면출력(정사각형 넓이를 구하는 기능 구현)
		MyFunctionalInterface3 sArea = (length) -> {
			double result =  length * length;
			System.out.println("정사각형의 넓이: " + result);
		};
		sArea.run(6); // 한 변의 길이
	}
}
