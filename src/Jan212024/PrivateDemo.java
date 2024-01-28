package Jan212024;

//office
class MyPrivateDemo
{
    //private class A
    //{
    //}
    private int privatevariable=10;
    private void privateDemoMethod()
    {
        System.out.println("Mai hu Private ");
    }


}
public class PrivateDemo
{
    public static void main(String[] args) {
       MyPrivateDemo t1=new MyPrivateDemo();
      // t1.privatevariable(); //It is private that's why we can not access out of the class
    }
}
