package Jan112024;

public class ExceptionDemo1
{
    public static void main(String[] args) {
        m1();
    }
    public static void  m1()
    {
        System.out.println("Hello m1");
        m2();
        System.out.println("By m1");
    }

    public static void m2()
    {
        System.out.println("Hello m2");

        try {
            System.out.println("In try block");
            System.out.println(10 / 0);
            System.out.println("try blockS"); /// exception ke badd vala code or lines execute nhi hota hai
        }
        catch (Exception e)
        {
            System.out.println("aao bhai exception ");
            //e.printStackTrace();// location + description + error name

            //e.toString(); //error name + description
            //System.out.println(e.toString());

            //e.getMessage();
            //System.out.println(e.getMessage());

            e.getCause();
            System.out.println(e.getCause());

        }
        System.out.println("Bye m2");
    }
}
