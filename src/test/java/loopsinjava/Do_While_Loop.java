package loopsinjava;

public class Do_While_Loop {
	public static void main(String[] args) {

		// Do while loop executes statement until certain condition become false
		// the condition is evaluated after executing the loop body So loop will
		// be executed at least once even if the condition is false

		int i = 8;
		do {
			System.out.println("i value is : " + i );
			i++;//(i+1) this is the meaning of it 
		} while (i <= 9);// condition 

	}
}