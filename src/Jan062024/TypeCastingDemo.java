package Jan062024;

public class TypeCastingDemo
{
    public static void main(String[] args) {

        //widening (implicit) casting

        int num=10;
        System.out.println("The int value = "+num);

        //converting from int to double
        double d=num;
        System.out.println("The double value = "+d);

        //Narrowing (explicit) casting

        double data=10.55;
        System.out.println("The double value = "+data);

        //converting from double to int
       int a=(int) data;
        System.out.println("The int value = "+a);


    }
}
