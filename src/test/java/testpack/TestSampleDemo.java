package testpack;

import testpack2.TestDemo;

import static testpack2.TestDemo.Multiplication;

public class TestSampleDemo {

    public static void main(String[] args) {
        System.out.println("testfiles");
        // a statis method can be called
        addition();
        additionParameter(1,2);
        additionParameter(4,2);
        additionParameter(4,5);
        // onject creation
        // Baseclass object = new referenceclass()
        // this is how a nonstatic method can be accessed insidea static
        TestSampleDemo testsampledemo = new TestSampleDemo();
        System.out.println(testsampledemo.getName());

        Multiplication(3,2);

        TestDemo testdemo = new TestDemo();
        testdemo.Division(4,2);
    }

    public static void addition() {
        int a = 1;
        int b = 2;
        int result = a + b;
        System.out.println("the result of addition : " + result);
    }

    public String getName() {
        return "sample";
    }

    //parameterisation of a function
    public static void additionParameter(int a, int b) {
        int result = a + b;
        System.out.println("the result of addition : " + result);
    }
}
