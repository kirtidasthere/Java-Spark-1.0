package Feb.Feb032024;

import java.util.HashMap;

public class CollectionQuestions1
{
    public static void main(String[] args) {
        int arr[]={10,20,40,10,30,50};
        //freq 10-->220-->1 40-->1 30-->1 50-->1

        //approach-1
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int val:arr)
        {
            if(map.containsKey(val))
            {
                map.put(val, map.get(val)+1);
            }
            else
            {
                map.put(val,1);

            }
        }
        System.out.println(map);
    }
}
