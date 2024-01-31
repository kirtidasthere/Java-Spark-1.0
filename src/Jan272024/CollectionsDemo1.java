package Jan272024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
class A implements Cloneable

{
    int a=10;

    public A clone()
    {
        try {
            return (A) super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            throw new AssertionError();
        }
    }
}
// it is already written in a other same package
 */
public class CollectionsDemo1
{
    public static void main(String[] args)
    {
        List<Integer> list=new ArrayList<>();

        list.add(10);
        list.add(10);
        list.add(20);
        list.add(130);
        list.add(40);
        System.out.println(list);
        System.out.println(list.get(3));

        List<Integer> list1=new ArrayList<>();
        list1.add(50);
        list1.add(60);
        list1.add(70);
        System.out.println(list.addAll(list1));
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(30));
        System.out.println(list.isEmpty());


        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }

        //iterator
        Iterator<Integer> it=list.iterator(); //collection
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

        for (Integer value:list)
        {
            System.out.println(value);
        }

    }
}
