package ProtectedCheck;
import Jan212024.ProtectedExm;
public class ProtectedCheck1 extends ProtectedExm
{
    public void m1()
    {
        int a=demo;
        display();
    }

    @Override
    protected void display() {
        System.out.println("slslsldlj....");
    }

    public static void main(String[] args) {
        ProtectedCheck1 p=new ProtectedCheck1(); //it is inheritance not a protected
        p.display();

    }
}
