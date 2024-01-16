package HWQuestions;
//Q3. write a java program to check number is div by 5

import java.util.Scanner;

public class numdiv5Q3
 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter the number:");
        int a=sc.nextInt();

        if(a%5==0)
        {
            System.out.println("The given number is divide by 5");
        }
        else
        {
            System.out.println("The given number is not divide by 5");
        }
    }
    
}