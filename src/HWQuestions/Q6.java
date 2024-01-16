package HWQuestions;
//Write a java program to take input N1 and N2 the show message to user
/* enter one from add 
enter two from sub
enter three from div 
enter 4 from mul 
*/

import java.util.Scanner;

class Q6 
{
    public static void main(String[] args) 
    {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the first number (n1)
        System.out.println("Enter the first number:");
        int n1 = sc.nextInt();

        // Prompt the user to enter the second number (n2)
        System.out.println("Enter the second number:");
        int n2 = sc.nextInt();

        // Display a menu for the user to choose an operation
        System.out.println("1 for addition, 2 for subtraction, 3 for division, 4 for multiplication");

        // Take the user's choice as input
        int choice = sc.nextInt();

        // Use a switch statement to perform the chosen operation
        switch (choice) {
            case 1:
                System.out.println("Sum: " + (n1 + n2));
                break;

            case 2:
                System.out.println("Difference: " + (n1 - n2));
                break;

            case 3:
                // Check if the second number is not zero before performing division
                if (n2 != 0) {
                    System.out.println("Quotient: " + (n1 / n2));
                } else {
                    System.out.println("Invalid option selected. Division by zero is not allowed.");
                }
                break;

            case 4:
                System.out.println("Product: " + (n1 * n2));
                break;

            default:
                System.out.println("Your input is not understandable for the terminal.");
                break;
        }
    }
}
