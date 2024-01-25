package Jan112024;

public class ThrowDemo
{
    public static void main(String args[])
    {
        m1();
    }
    public static void m1()
    {
        try{
            throw new ArithmeticException("Main Reason nhi dunga Karana ha jo kar le");
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.toString());
        }
    }
}
