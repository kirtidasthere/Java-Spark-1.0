package HWQuestions;
//write Java program to check number is prime or not

import java.util.Scanner;

public class primeOrnonQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number:");
        int number = sc.nextInt();

        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("Given number is a Prime number");
        } else {
            System.out.println("Given number is not a Prime number");
        }
    }
}