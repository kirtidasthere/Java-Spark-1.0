package Jan212024;

class MyProtectedClass
{
    protected int a= 199;
    protected void display()
    {
        System.out.println("Mai hu Raja Bina paise Wala");
    }
}
public class ProtectedDemo
{
    public static void main(String[] args) {
        MyProtectedClass m1=new MyProtectedClass();
        System.out.println(m1.a);
        m1.display();

    }
}
