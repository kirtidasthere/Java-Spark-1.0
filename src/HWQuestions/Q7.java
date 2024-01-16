package HWQuestions;
//Write Java program to take input
//enter number for which you want  table 2 to 5
//2--->
//3--->

import java.util.Scanner;

class Q7
{
    public static void main(String[] args) 
    {
      Scanner sc= new Scanner(System.in);
      
      System.out.println("Enter the number which table you want:");
      int a=sc.nextInt();

      for(int i=1;i<=10;i++)
      {
        System.out.println(a + "*" + i + "=" + a*i);
      }
    }
}
