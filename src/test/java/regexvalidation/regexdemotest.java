package regexvalidation;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexdemotest {
    public static void main(String[] args) {
       int [] sampleint = new int[6];
        String sample = "this is my project with id 123456";
        extractNumberFromString(sample);
//        System.out.println(sample.substring(27,33));
//
//        char[] chararray = sample.toCharArray();
//
//        for(char ch : chararray){
//            if(Character.isDigit(ch)){
//                System.out.println(ch);
//                for(int i =0 ; i< sampleint.length;i++){
//                    sampleint[i] = ch;
//                }
//            }
//        }
//
//        System.out.println(Arrays.toString(sampleint));
    }


    public static void extractNumberFromString(String input){
        Pattern p = Pattern.compile("([0-9]+)");
        Matcher m = p.matcher(input);
        if(m.find()){
            System.out.println(m.group());
        }
    }
}
