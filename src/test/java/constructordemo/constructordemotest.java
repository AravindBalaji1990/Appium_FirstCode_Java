package constructordemo;

public class constructordemotest {
public int number =11;

//this keyword will help us to identify the variable value at the point and at that instance
public constructordemotest(int number){
        this.number =number;
    }

    public void samplemethod(){
    // if we do nto initialise the varibale at the class level then the variable is getting overridden
        // but if we initialise the variable again then the constructor level will be given preference due to this  keyword
         number = 13;
        System.out.println("this is a sample method with :  " +this.number);
    }

    public static void main(String[] args) {
        constructordemotest obj = new constructordemotest(12);
        obj.samplemethod();
    }
}
