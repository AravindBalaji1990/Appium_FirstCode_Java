package Condition_Loop;

import java.util.Scanner;

public class SwitchCase3 {

	public static void main(String[] args) {
		// Inside the case we can have any user defined print or logics in it
		// if the case is satisfied what should i do
		int valuetocheck = 10;
		switch (valuetocheck) {
		case 1:
			System.out.println("first case is satisfied");
			break;
		case 11:
			System.out.println("second case is satisfied");
			break;
		case 10:
			System.out.println("third case is satisfied");
			break;
		default:
			System.out.println("Nothing is satisfied");
		}
	}
}
