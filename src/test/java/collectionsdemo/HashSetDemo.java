package collectionsdemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        //initialise
        Set<String> obj = new HashSet<>();
//    HashSet<String> obj1 = new HashSet<>();

        obj.add("Sample1");
        obj.add("Sample2");
        obj.add("Sample1");
        obj.add("Sample4");
        obj.add("Sample5");
        obj.add(null);
        obj.add(" ");

        for(String data : obj){
            System.out.println("the items inside the set : " + data);
        }




        obj.remove("Sample5");
        Iterator<String> iterator = obj.iterator();
        //below item will give a true or false
        // if items are available then true if not false
        while(iterator.hasNext()){
            System.out.println("get the items from the set using iterator : " +iterator.next());
        }
    }

}
