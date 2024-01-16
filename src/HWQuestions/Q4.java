package HWQuestions;
//Q4.WAP to check the given input is character or digit

import java.util.Scanner;
class Q4
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the character or digit or Symbol:");
        
       char ch=sc.next().charAt(0);

        System.out.println(ch>='a' && ch<='z' ?"Small case Alphabet"
                            :ch>='A' && ch<='Z' ? "Capital Alphabet"
                            :ch>='0' && ch<='9' ?"It is a digit"
                            :"Symbol"
                );

    }
}  



