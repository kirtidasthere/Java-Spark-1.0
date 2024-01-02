package Dec172023;

public class ArrayDemo
{
    public static void main(String[] args) {
        int ar[]=new int[10];  //initialization / Declaration

        for (int i = 0; i < 10; i++)
        {
            ar[i]=i; //setting value of array through loop
            //ar[0]=0
            //ar[1]=1

        }
        for(int a :ar)  //accessing element of array using for each loop
        {
            System.out.println(a);
        }

        int arr[]={10,20,30,40,50,60};
        System.out.println("-------------------");

        for(int a : arr)
        {
            System.out.println(a);
        }

        arr[2]=100; //setting a value in array
        System.out.println("-------------------");
        for(int a:arr)
        {
            System.out.println(a);
        }

        System.out.println("---------------------");

        //length
        System.out.println("Length of array = "+ arr.length);

    }
}
