package HWQuestions;

import java.util.Scanner;

//write a program to find factorial of given number
public class FactorialOfNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number : ");
        int a=sc.nextInt();

        int fact=1;
        for (int i = 1; i <=a ; i++)
        {
            fact = fact * i;

        }
        System.out.println("Factorial of " +a +" is : "+fact);

    }
}
