package collectionsdemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        // wyas to initalise the list
        List<String> demo = new LinkedList<>();
        
//        LinkedList<String> demo = new LinkedList<>();

        // add the data to the list

        demo.add("sample1");
        demo.add("sample2");
        demo.add("sample3");
        demo.add("sample4");
        demo.add("sample5");
        demo.add(" ");
        demo.add(null);



        for(int i =0 ; i< demo.size();i++){
            System.out.println(" after retain all  items inside the list : " + demo.get(i));
        }
    }
}
