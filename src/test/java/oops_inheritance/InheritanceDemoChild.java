package oops_inheritance;

public class InheritanceDemoChild extends InheritanceDemoParent{

    int number2 = 2000;


    public void demoArithmeticMultiply(){
        int a =2;
        int b =3;
        int  result = a* b;
        System.out.println("the multiplicaiton result : " + result);
    }

    public static void main(String[] args) {
        InheritanceDemoChild childobj = new InheritanceDemoChild();
        childobj.demoArithmeticAddition();
        System.out.println(childobj.number);
        childobj.demoArithmeticMultiply();
        System.out.println(childobj.number2);
    }
}
