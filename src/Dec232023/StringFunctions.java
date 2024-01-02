package Dec232023;

import java.util.Arrays;

public class StringFunctions
{
    public static void main(String[] args) {
        //length
        String s="kirtidas There";
        System.out.println(s.length());

        //concatenation
        String s1="kirtidas";
        String s2="There";
        String s3=s1+s2;
        System.out.println(s3);

        //tocharArray()
        String s4="Kirtidas";
        char arr[]=s4.toCharArray();
        System.out.println("to Char Array = "+arr);//hashcode
        System.out.println("to Char Array = "+ Arrays.toString(arr));

        //another method  
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }

        //charAt()
        String s11="Kirtidas";
        System.out.println("char at = "+ s11.charAt(1));

        //compareTO()
        String s12="hello";
        String s13="hello";
        int res=s12.compareTo(s13);
        System.out.println(res);

        //== reference compare equals() (String ka content check hota hai )
        System.out.println(s12.equals(s13));

        //contains()
        String s15="hello kirtidas welcome to the development batch Spark 1.0";
        System.out.println(s15.contains("kirtidas"));
        System.out.println(s15.contains("Ashwani"));

        //indexOf()
        System.out.println(s15.indexOf('a'));

        //replace()
        String ss="hello World";
        String res1=ss.replace("hello","Kirtidas");
        System.out.println(res1);

        //subString()
        String r1="hello kirtidas welcome to the development batch Spark 1.0";
        String r2=r1.substring(0,7); // 0 to end-1
        System.out.println(r2);

        String r3=r1.substring(4);
        System.out.println(r3);



    }
}
