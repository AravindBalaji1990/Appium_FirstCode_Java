package loopsinjava;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// Inside the case we can have any user defined print or logics in it
		// if the case is satisfied what should i do
		String valuetocheck = "two";
		switch (valuetocheck) {
		case "one":
			method();
			break;
		case "two":
			System.out.println("executing second case");
			break;
		case "three":
			System.out.println("executing third case");
			break;
		// Non mandatory it is used to check only if the condition is
		// not satisfied.
		default:
			System.out.println("Not in 1,2,3");
			DefaultMethod();
		}
	}

	public static void method() {
		int a = 1;
		int b = 2;
		int result = a + b;
		System.out.println("the result :" + result);
	}

	public static void DefaultMethod(){
		System.out.println("method can also be in the deafult");
	}
}
