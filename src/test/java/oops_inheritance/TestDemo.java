package oops_inheritance;

public interface TestDemo {
    int variable1 =1000;
    public void sampleMethod1();
    public int sampleMethod2();
    public String sampleMethod2(String name);
    public default void sampleMethod3(){
        System.out.println("this is from interface but with method body");
    }
    public static void sampleMethod4(){
        System.out.println("this is from interface but with method body");
    }

}
