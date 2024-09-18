package castingdemo;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class CastingDemo {
    public static void main(String[] args) {
        int num =1000;
        System.out.println(String.valueOf(num) +" which of data type "+ String.valueOf(num) instanceof String);

        String [] sample ={"sample1","sample2"};
        System.out.println(Arrays.toString(sample));

        String name = "1000";
        int num1 = Integer.parseInt(name);
        System.out.println(num1);

        int number = Integer.parseInt(name);
        System.out.println(Integer.valueOf(number) instanceof Integer);

        double d = 10.10;
        // casting
        int num2 = (int) d;
        System.out.println(num2);

        String name1 = "sample";
        char[] test = name1.toCharArray();
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }

        double a = 999;
        double b = 2;
        double res = a / b;
        DecimalFormat df = new DecimalFormat("0.###");
        String data = df.format(res);
        System.out.println(data);


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.format(dtf));
        ZonedDateTime zdt = now.atZone(ZoneId.systemDefault());
        System.out.println(zdt.format(dtf));
    }
}
