package Jan272024;

class A implements Cloneable
{
    int a=10;
    public A clone()
    {
        try
        {
            return(A) super.clone();
        }
        catch(CloneNotSupportedException e)
        {
            throw new AssertionError();
        }

    }
}
public class CollectionsDemo
{
    public static void main(String[] args) {
        A object=new A();
        System.out.println(object.hashCode());
        System.out.println(object.a);

        A cloneobject=object.clone();
        object.a=20;
        System.out.println(object.a);
        System.out.println(cloneobject.hashCode());
        System.out.println(cloneobject.a);
    }
}
