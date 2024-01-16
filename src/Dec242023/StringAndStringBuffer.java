package Dec242023;

public class StringAndStringBuffer {
    public static void main(String[] args) {


        //String
        String s1 = "hello";
        String s2 = s1.concat("World");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);

        StringBuffer sb=new StringBuffer("Kirtidas");
        sb.append("There");
        System.out.println(sb);

    }
}