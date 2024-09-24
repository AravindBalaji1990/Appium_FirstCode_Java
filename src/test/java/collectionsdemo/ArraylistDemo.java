package collectionsdemo;

import java.util.ArrayList;
import java.util.List;

public class ArraylistDemo {
    public static void main(String[] args) {
        // ways to initalise the list
        List<String> arraydemo = new ArrayList<>();

        // add the data to the list
        arraydemo.add("sample1");
        arraydemo.add("sample2");
        arraydemo.add("sample3");
        arraydemo.add("sample4");
        arraydemo.add("sample5");

        System.out.println("total items from the list : " +arraydemo.size());
        System.out.println("get a specific items from the list : " +arraydemo.get(1));

        for(int i =0 ; i< arraydemo.size();i++){
            System.out.println("items inside the list : " + arraydemo.get(i));
        }

        // delete any items from the list
        arraydemo.remove("sample1");

        for(int i =0 ; i< arraydemo.size();i++){
            System.out.println(" after delete items inside the list : " + arraydemo.get(i));
        }

        ArrayList<String> arraydemo1 = new ArrayList<>();

        arraydemo1.add("sample1");
        arraydemo1.add("sample2");
        arraydemo1.add("sample3");
        arraydemo1.add("sample4");
        arraydemo1.add("sample5");

        // if we want to combine two lists
        arraydemo.addAll(arraydemo1);

        for(int i =0 ; i< arraydemo.size();i++){
            System.out.println(" after combining  items inside the list : " + arraydemo.get(i));
        }

        // incase if we wan tto identify the common items between two list
// here we didgot all the items in retainall - we did a addall then in arraydemo all the items are available
// so when we did a retain all all the items was priinted
        arraydemo.retainAll(arraydemo1);
        for(int i =0 ; i< arraydemo.size();i++){
            System.out.println(" after retain all  items inside the list : " + arraydemo.get(i));
        }
    }
}
