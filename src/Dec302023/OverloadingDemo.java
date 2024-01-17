package Dec302023;

public class OverloadingDemo
{
    public int add(int a, int b)
    {
        System.out.println("Addition a+b is: "+(a+b));
        return a + b;
    }

    public int add(int a, int b, int c)
    {
        System.out.println("Addition is a+b+c : "+(a+b+c));
        return a+b+c;
    }

    public static void main(String[] args) {
        OverloadingDemo n=new OverloadingDemo();
        n.add(3,5);
        n.add(2,3,4);
    }
}

