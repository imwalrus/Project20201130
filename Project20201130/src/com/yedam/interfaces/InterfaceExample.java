package com.yedam.interfaces;

interface Runnable {
	public void run();
}

class AutoRun implements Runnable {
	@Override
	public void run() {
		System.out.println("자동실행.");
	}
}

class NewRun implements Runnable {
	@Override
	public void run() {
		System.out.println("새로운실행.");
	}
}

public class InterfaceExample {
	public static void main(String[] args) {
		Runnable runnable = new AutoRun();
		runnable.run();
//
		runnable = new NewRun();
		runnable.run();
//
		runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("익명실행.");
			}
		};
		runnable.run();
//
		runnable = () -> System.out.println("또다른 익명실행.");
		runnable.run(); // 람다 표현식
	}
}
