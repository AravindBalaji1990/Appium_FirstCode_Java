package oops_encapsulation;

public class EncapsulationDemo {
    // geter and setter
    // pojo class
    private String name;
    private int age;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name + "XXXXXXX";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public static void main(String[] args) {
        EncapsulationDemo obj = new EncapsulationDemo();
        obj.setAge(12);
        System.out.println(obj.getAge());
        obj.setName("appium");
        System.out.println(obj.getName());
    }

}
