package oops_inheritance;

public class TestSample2 implements TestDemo{
    @Override
    public void sampleMethod1() {
        System.out.println("this is from another class");
    }

    @Override
    public int sampleMethod2() {
        return 4000;
    }

    @Override
    public String sampleMethod2(String name) {
        return name;
    }
}
