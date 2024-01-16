package Dec242023;

public class CommandLineArgument
{
    public static void main(String[] args) {

        //convert into integer type
        int number1 = Integer.parseInt(args[0]);
        System.out.println("First number:"+ number1);

        //convert into integer type
        int number2 = Integer.parseInt(args[1]);
        System.out.println("Second number:"+ number2);

        int result=number1 + number2;
        System.out.println(result);
    }
}
