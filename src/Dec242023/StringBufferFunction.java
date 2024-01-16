package Dec242023;

public class StringBufferFunction
{
    public static void main(String[] args) {

        //append()
        StringBuffer sb=new StringBuffer("Kirtidas");
        sb.append("There");
        System.out.println(sb);

        //insert()
        sb.insert(2,123);
        System.out.println(sb);

        //reverse()
        sb.reverse();
        System.out.println(sb);

        //replace()
        sb.replace(6,11,"Hello");
        System.out.println(sb);

        StringBuffer sb1=new StringBuffer();
        System.out.println(sb1.capacity());


    }
}
