package collectionsdemo;

import java.util.ArrayList;
import java.util.List;

public class ArraylistDemo2 {
    public static void main(String[] args) {
        // wyas to initalise the list
        List<String> arraydemo = new ArrayList<>();

        // add the data to the list

        arraydemo.add("sample1");
        arraydemo.add("sample2");
        arraydemo.add("sample3");
        arraydemo.add("sample4");
        arraydemo.add("sample5");
        arraydemo.add(" ");
        arraydemo.add(null);



        for(int i =0 ; i< arraydemo.size();i++){
            System.out.println(" after retain all  items inside the list : " + arraydemo.get(i));
        }
    }
}
