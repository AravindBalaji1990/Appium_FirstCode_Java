package collectionsdemo;

import java.util.ArrayList;
import java.util.List;

public class ArraylistDemo1 {
    public static void main(String[] args) {
        // wyas to initalise the list
        List<String> arraydemo = new ArrayList<>();

        // add the data to the list

        arraydemo.add("sample2");
        arraydemo.add("sample3");
        arraydemo.add("sample4");
        arraydemo.add("sample5");


        ArrayList<String> arraydemo1 = new ArrayList<>();

        arraydemo1.add("sample1");
        arraydemo1.add("sample2");
        arraydemo1.add("sample3");
        arraydemo1.add("sample4");
        arraydemo1.add("sample5");


        // incase if we wan tto identify the differnece between two list

        arraydemo.retainAll(arraydemo1);
        for(int i =0 ; i< arraydemo.size();i++){
            System.out.println(" after retain all  items inside the list : " + arraydemo.get(i));
        }
    }
}
