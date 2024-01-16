package Dec232023;

public class StringDemo2
{
    public static void main(String[] args) {
        String s1="Hello";
        String s2=new String("Hello");
        System.out.println(s1==s2);





        String s3="Hello";
        String s4="World";
        String s5=s3 + s4;
        System.out.println(s3);

        System.out.println(s4);
        System.out.println(s5);

        String s="Kirtidas there";
        int len=s.length();
        System.out.println(len);


    }
}
