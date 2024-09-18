package variablesdemo;

import java.util.StringTokenizer;

public class VariablesDemoSample {

    public static void main(String[] args) {
        String name ="sample";
//        int num = 19;
//        long num2 = 3432;
//
//        char sample = 'a';
//        boolean condi = true;

        name = "sample project";
        name = "sample project1";
        name = "sample project2";
        name = "sample project3";
        System.out.println("final output for the value : " + name);
        System.out.println("final output for the value : " + name.contains("project"));
        System.out.println("final output for the value : " + name.startsWith("project"));
        System.out.println("final output for the value : " + name.endsWith("project"));

        name = name.concat(" sample");
        System.out.println("the output : "+name);

        name = name + " sample";
        System.out.println("the output : "+name);

        //String Buffer usage
        StringBuffer bs = new StringBuffer("sample demo");
        System.out.println("output of string buffer : " +bs);
        bs.reverse();
        System.out.println("output of string buffer : " +bs);

        bs.append(" sample");
        System.out.println("output of string buffer : " +bs);
        System.out.println("output of string buffer : " +bs.substring(2));
        System.out.println("output of string buffer : " +bs.substring(2, 5));

        //String Builder
        StringBuilder sb = new StringBuilder("sample demo session");
        System.out.println("the dta available for string builder : " +sb);
        sb.reverse();
        System.out.println("output of string buffer : " +sb);

        sb.append(" sample");
        System.out.println("output of string buffer : " +sb);
        System.out.println("output of string buffer : " +sb.substring(2));
        System.out.println("output of string buffer : " +sb.substring(2, 5));


        //String Tokenizer
        String word = "This is my, demo channel";
        StringTokenizer st = new StringTokenizer(word,",");
        System.out.println(st.hasMoreTokens());
        while(st.hasMoreTokens()){
            System.out.println("the data available : " + st.nextToken());
        }

        String[] spltitems = word.split(",");
      for (int i =0; i< spltitems.length; i ++){
          System.out.println("split with array : " +spltitems[i]);
      }


    }
}
