package Jan112024;

public class ExceptionDemo3
{
    public static void main(String[] args) {
        System.out.println(Print());
    }

    public static int Print()
    {
        try{
            // System.exit(0); //jvm shut down hota hai
            System.out.println(10/0);
        }
        catch (ArithmeticException e)
        {
            return 778;
        }
        finally {
            return 222;
        }
    }
}
