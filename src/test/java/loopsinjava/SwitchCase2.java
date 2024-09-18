package Condition_Loop;

import java.util.Scanner;

public class SwitchCase2 {

	public static void main(String[] args) {
		// Inside the case we can have any user defined print or logics in it
		// if the case is satisfied what should i do
		int number = 2;

		switch (number) {
		case 1:
			method();
			break;
		case 2:
			System.out.println("executing case 2");
			break;
		case 3:
			System.out.println("executing case 3");
			break;

		default:
			DefaultMethod();

		}
	}

	public static void method() {
		int a = 1;
		int b = 2;
		int result = a + b;
		System.out.println("the result :" + result);
	}

	public static void DefaultMethod() {
		System.out.println("method can also be in the deafult");
	}
}
