package HWQuestions;
//write java program to compare two string ?
import java.util.Scanner;
public class CompareTwoString
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a first String: ");
        String n1=sc.next();

        System.out.println("Enter a second String: ");
        String n2=sc.next();

        if ( n1.equalsIgnoreCase(n2) )
        {
            System.out.println("Both String are equal");

        }
        else
        {
            System.out.println("Both String are not equal");
        }
    }
}
