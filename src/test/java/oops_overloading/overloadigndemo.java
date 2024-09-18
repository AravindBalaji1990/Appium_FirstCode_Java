package oops_overloading;

public class overloadigndemo {

    public void sampleMethod(){
        System.out.println("this is a samle method");
    }

    public void sampleMethod(String name){
        System.out.println("this is a samle method : " +name);
    }

    public void sampleMethod(String value, int num){
        System.out.println("this is a samle method : " +value + " - "+num);
    }
    public static void main(String[] args) {
        overloadigndemo obj = new overloadigndemo();
        obj.sampleMethod();
        obj.sampleMethod("text");
        obj.sampleMethod("sample",4000);

    }
}
