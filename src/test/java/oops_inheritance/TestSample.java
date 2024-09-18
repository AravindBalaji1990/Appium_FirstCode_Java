package oops_inheritance;

public class TestSample extends DemoParent implements  TestDemo,TestDemo2{
    public void sampleMethod1() {
        System.out.println("this is form TestSample class");
    }

    @Override
    public int sampleMethod2() {
        System.out.println("this is form TestSample class");
        return 3000;
    }

    @Override
    public String sampleMethod2(String name) {
        return name;
    }

    public static void main(String[] args) {
        TestSample demoobj = new TestSample();
        //from another interface
        demoobj.sampleText();
        // calling from parent
        demoobj.demoArithmetic();
        System.out.println(demoobj.sampleMethod2());
        demoobj.sampleMethod1();
        System.out.println(demoobj.sampleMethod2("sample name"));
        // default method can be invoked with the same object
        demoobj.sampleMethod3();
        // interface reference should be used instead if class object reference if the
        // intereface method has a static keyword
        TestDemo.sampleMethod4();

        TestSample2 demoobj2 = new TestSample2();
        demoobj2.sampleMethod1();
        System.out.println(demoobj2.sampleMethod2());
        System.out.println(demoobj2.sampleMethod2("sample name2"));

    }

    @Override
    public void sampleText() {
        System.out.println("this is from another interface");
    }
}
