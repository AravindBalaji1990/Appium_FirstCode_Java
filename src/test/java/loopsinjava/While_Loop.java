package loopsinjava;

public class While_Loop {

	// while is nothing but the condition will be
	// executed till it becomes true

	public static void main(String[] args) {
		// initialisation
		int i = 21;
		// condition
		while (i <= 20) {
//			System.out.println("the value of i :" + i);
			// increment/decrement
			// increment and use the incremented value in the next i value
			i++;
			System.out.println("the value of i after increment:" + i);
		}
//		System.out.println("the condition is not satisfied");
	}

}
