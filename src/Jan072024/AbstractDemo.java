package Jan072024;

abstract class vehicle
{
int a;
public abstract void engine();

public void print()
{
    System.out.println("Hello");
}

vehicle()
{

}
}
public class AbstractDemo extends vehicle
{
    public void engine()
    {
        System.out.println("Car Engine");
    }
    public static void main(String[] args)
    {
        vehicle v=new AbstractDemo();
        v.engine();
        System.out.println(v.a);



    }
}
