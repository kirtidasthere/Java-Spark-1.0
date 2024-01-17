package Jan052023;

class Test
{
    Test()
    {
        super();
        System.out.println("main test hu........");
    }
}
public class Demo extends Test
{
    int a;
    Demo()
    {
        this(10);
        System.out.println("child............");
    }

    public Demo(int i)
    {
        super();  //calling Parent class constructor
        System.out.println("Arg.........");
    }

    public static void main(String[] args)
    {
        Demo demo=new Demo();


    }
}
