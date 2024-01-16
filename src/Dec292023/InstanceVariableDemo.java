package Dec292023;

public class InstanceVariableDemo
{
    int a=10; //Instance
    int b;

    public static void main(String[] args) {
        InstanceVariableDemo instance1 = new InstanceVariableDemo();
        System.out.println(instance1.a);
        System.out.println(instance1.b);

        instance1.a=100;
        instance1.b=900;
        System.out.println(instance1.a);
        System.out.println(instance1.b);

        InstanceVariableDemo instance2=new InstanceVariableDemo();
        instance2.demo();
    }
    public void demo()
    {
        System.out.println(a);
    }
}
