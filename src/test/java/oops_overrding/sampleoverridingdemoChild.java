package oops_overrding;

public class sampleoverridingdemoChild extends sampleoverridingdemo{

    public void sampleFunction(){
        System.out.println("this is a child");
    }

    public static void main(String[] args) {
        //creating an object baseclass object= new referenceclass
        sampleoverridingdemo obj = new sampleoverridingdemoChild();
        obj.sampleFunction();
    }
}
