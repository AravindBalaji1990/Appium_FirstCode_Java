package collectionsdemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo1 {
    public static void main(String[] args) {
        // ways to initalise the list
        List<String> linkeddemo = new LinkedList<>();

        // add the data to the list
        linkeddemo.add("sample1");
        linkeddemo.add("sample2");
        linkeddemo.add("sample3");
        linkeddemo.add("sample4");
        linkeddemo.add("sample5");

        System.out.println("total items from the list : " +linkeddemo.size());
        System.out.println("get a specific items from the list : " +linkeddemo.get(1));

        for(int i =0 ; i< linkeddemo.size();i++){
            System.out.println("items inside the list : " + linkeddemo.get(i));
        }

        // delete any items from the list
        linkeddemo.remove("sample1");

        for(int i =0 ; i< linkeddemo.size();i++){
            System.out.println(" after delete items inside the list : " + linkeddemo.get(i));
        }

        ArrayList<String> linkeddemo1 = new ArrayList<>();

        linkeddemo1.add("sample1");
        linkeddemo1.add("sample2");
        linkeddemo1.add("sample3");
        linkeddemo1.add("sample4");
        linkeddemo1.add("sample5");

        // if we want to combine two lists
        linkeddemo.addAll(linkeddemo1);

        for(int i =0 ; i< linkeddemo.size();i++){
            System.out.println(" after combining  items inside the list : " + linkeddemo.get(i));
        }

        // incase if we wan tto identify the common items between two list
// here we didgot all the items in retainall - we did a addall then in linkeddemo all the items are available
// so when we did a retain all all the items was priinted
        linkeddemo.retainAll(linkeddemo1);
        for(int i =0 ; i< linkeddemo.size();i++){
            System.out.println(" after retain all  items inside the list : " + linkeddemo.get(i));
        }
    }
}
