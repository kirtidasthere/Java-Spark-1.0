package HWQuestions;
//Write Java program to check input from user as an example 1,2,3---------10
//2---->two
//3---->three

import java.util.Scanner;

class Q5
{
    public static void main(String[] args) 
    {
      Scanner sc= new Scanner(System.in);
      
      System.out.println("Enter the number:");
      int a=sc.nextInt();

      String number;
      switch (a) {
        case 1:
        number="One";
            break;

        case 2:
        number="two";
            break;
        
        case 3:
        number="three";
            break;

        case 4:
        number="four";
            break;

        case 5:
        number="five";
            break;

        case 6:
        number="six";
            break;

        case 7:
        number="Seven";
            break;

        case 8:
        number="eight";
            break;

        case 9:
        number="nine";
            break;

        case 10:
        number="ten";
            break;

      
        default:
        number="It is not present in the Question";
            break;
      }
      System.out.println(number);

    }
}