package oops_abstraction;

public class SampleDemo extends  abstractiondemo{
    public static void main(String[] args) {
        abstractiondemo obj = new SampleDemo();
        // ethod with body form abstract class
        obj.demoMethod();

        System.out.println(obj.sampleMethod2());
        obj.sampleMethod();
    }

    @Override
    void sampleMethod() {
        System.out.println("this is from sample demo");
    }

    @Override
    int sampleMethod2() {
        return 4000;
    }
}
