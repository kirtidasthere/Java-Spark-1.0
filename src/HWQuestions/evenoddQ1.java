package HWQuestions;
//Write Java program to check number is even or odd
import java.util.Scanner;
class evenoddQ1
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the any Number:");
        int a=sc.nextInt();

       if(a%2==0)
        {
            System.out.println("Given number even");
        }
        else
        {
            System.out.println("Given number is odd");
        } 
    }

}