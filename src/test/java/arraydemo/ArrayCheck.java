package arraydemo;

import java.util.Arrays;

public class ArrayCheck {

    public static void main(String[] args) {
// initialise by using the data
        String[] arraystring = {"sample1", "sample2", "sample3"};
        // total items availabl ein the array
        System.out.println("the total items in the array :" + arraystring.length);

        // it will show a alphanumeric number
        System.out.println("the items in the array : " + arraystring.toString());
        System.out.println("the items in the array : " + Arrays.toString(arraystring));

        //get the element inside the array based on the position
        System.out.println("the specific position element in array : " + arraystring[1]);
        System.out.println("the specific position element in array : " + arraystring[0]);

        for (int i = 0; i < arraystring.length; i++) {
            // here we are gettign the position if the array and the value of the array
            System.out.println("the items in the array :" + i + " - " + arraystring[i]);
        }

        for(String data : arraystring){
            System.out.println("the items inside array : " + data);
        }
    }
}
