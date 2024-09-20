package exceptionhandling;

public class DemoException {
    public static void main(String[] args) throws cutomexceptiondemo {
        ExceptionDemo();
    }

    public static void ExceptionDemo() throws cutomexceptiondemo{
        throw new cutomexceptiondemo("this is my custom exception");
    }
}
