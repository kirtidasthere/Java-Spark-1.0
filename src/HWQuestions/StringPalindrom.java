package HWQuestions;
//Write a java program to check string is palindrome or not ?
import java.util.Scanner;
public class StringPalindrom
{
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: " );

        String original=sc.nextLine(),reverse="";

        for (int i =original.length() -1; i >=0 ; i--)

             reverse= reverse + original.charAt(i);

            if (original.equals(reverse)) {
                System.out.println("Entered string is a palindrome.");
            }
            else
                {
                    System.out.println("Entered string isn't a palindrome.");
            }



    }
}
