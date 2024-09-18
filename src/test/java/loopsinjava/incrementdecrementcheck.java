package loopsinjava;

public class incrementdecrementcheck {
    public static void main(String[] args) {
        int i =1;
        // if the increment is after the value then only on the next calling of i it will increment
        System.out.println(i++);
        System.out.println(i);

        //if the increment is before the value then it will be updated incremented value
        System.out.println(++i);
        System.out.println("--------------------");
        System.out.println(i--);
        System.out.println(i);
        System.out.println(--i);


    }
}
