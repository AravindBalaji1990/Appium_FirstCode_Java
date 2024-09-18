package Condition_Loop;

public class For_Loop2 {
	public static void main(String[] args) {
		// for each loop
		// we no need to specify the size of the array/collection
		// it simply iterates over the elements

		String[] stringarray = { "sample1", "sample2", "sample3" };
		// we are passing each element inside the array to another element
		for (String data : stringarray) {
			System.out.println("the items inside the array : " + data);
		}
		System.out.println("------------------------");

		// for loop with initialisaiton,condition, increment/decrement
//		for (int i = 0; i < stringarray.length; i++) {
//			System.out.println("the index value :" + i);
//			System.out.println("the items inside the array : " + stringarray[i]);
//		}

	}
}
