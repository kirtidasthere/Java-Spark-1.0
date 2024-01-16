
 //Write Java program to read shoes brand from user and print slogan like
 // Nike --> just do it
 // adidas --> impossible is nothing

package HWQuestions;
import java.util.Scanner;
public class ShoesBrandSlogan
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a shoes brand name like nike Adidas for slogan : ");
        String brand=sc.nextLine();

       if(brand.equalsIgnoreCase( "nike"))
       {
           System.out.println("just do it..");
       }
       else if (brand.equalsIgnoreCase("Adidas"))
       {
           System.out.println("Impossible is nothing..");
       }
       else {
           System.out.println("It is not present in link");
       }

    }
}
