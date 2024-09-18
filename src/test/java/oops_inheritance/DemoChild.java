package oops_inheritance;

public class DemoChild extends  DemoParent{
    int num =200;

    public void demoArithmetic(){
        int a =10;
        int b =11;
        int result = a*b;
        System.out.println("the multiply operation : " + result);
    }

    public void demoCheck(){
        System.out.println("calling form parent : " + super.num);
        super.demoArithmetic();
    }

    public static void main(String[] args) {
        DemoChild obj = new DemoChild();
        obj.demoArithmetic();
        obj.demoCheck();
    }
}
