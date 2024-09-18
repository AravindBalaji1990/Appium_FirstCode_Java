package Condition_Loop;

public class For_Loop {
	public static void main(String[] args) {

		// for(initialization;condition;increment/decrement) loop body will be
		// executed and after each iteration of loop body, expression is
		// executed which usually increase or decrease loop variable.
		// for(initialisation;condition;incrementing/decrementing)
		// for(int a: b)

		// incrementing the for loop
		for (int index = 1; index <= 6; index++) {
			System.out.println("Index is incrementing: " + index);
		}

		System.out.println("------------------------");

		// decrementing the for loop
		for (int index = 6; index >= 1; index--) {
			System.out.println("Index is decrementing: " + index);
		}
	}
}
