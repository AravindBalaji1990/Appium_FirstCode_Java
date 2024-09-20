package exceptionhandling;

import java.io.FileNotFoundException;

public class ExceptionHandlingDemo {

    public static void main(String[] args) {
        demoException2();
    }


    public static void demoException() {
        String[] data = {"sample1", "sample2", "sample3", "sample4"};
        try {
            System.out.println(data[5]);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println(e);
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public static void demoException1(){
        try{
            int result = 10/1;
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            // whether the try and catch executes or not if we need to runa particular logic irrespective of thetry and catch
            // then we can mention it under finally
            System.out.println("this is executing due to finally block");
        }
    }

    public  static void demoException2() throws ArithmeticException{
        int result =10/0;
        System.out.println(result);
    }
}
