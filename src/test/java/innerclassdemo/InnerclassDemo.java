package innerclassdemo;

public class InnerclassDemo {

    void outerMethod(){
        class LocalInner{
            void display(){
                System.out.println("this is local inner class");
            }
        }
        LocalInner obj = new LocalInner();
        obj.display();
    }
}

