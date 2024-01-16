package HWQuestions;
//Write a java program to read a person's basic salary and calculate PF amount
// from the basic salary. formula PF is 12% of BS
import java.util.Scanner;

public class BasicSalary
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the salary  : ");
        double basicsalary=sc.nextDouble();

        double pfAmount= 0.12 * basicsalary;

        System.out.println("pf Amount is: "+ pfAmount);

        // Close the Scanner to avoid resource leaks
        sc.close();
    }
}
