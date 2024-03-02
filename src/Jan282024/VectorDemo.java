package Jan282024;

import java.lang.reflect.Array;
import java.util.*;

public class VectorDemo
{
    public static void main(String[] args) {
        Vector<Integer> vector= new Vector<>();
        System.out.println(vector.capacity());

        for (int i = 0; i < 10; i++)
        {
            vector.addElement(i);
        }
        System.out.println(vector.capacity());
        vector.addElement(90);
        System.out.println(vector.capacity());
        System.out.println(vector);

        //Vector
        Enumeration<Integer> elements= vector.elements();
        while(elements.hasMoreElements())
        {
            Integer integer= elements.nextElement();
            System.out.println(integer);
        }

        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        Collections.sort(list);
        System.out.println("Sorted List="+ list);

        Iterator<Integer> iterator= list.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        ListIterator<Integer> listIterator=list.listIterator();
        while(listIterator.hasNext())
        {
            System.out.println(listIterator.next());
        }


    }
}
