package Dec222023;

public class LinearSearch
{
    public static void main(String[] args) {
        int arr[]={10,11,13,16,18,19};

        int k=18;
        boolean flag=false;
        for (int i = 0; i <arr.length ; i++)
        {
            if (arr[i]==k)
            {
                flag=true;
            }

        }
        System.out.println(flag);
    }
}
