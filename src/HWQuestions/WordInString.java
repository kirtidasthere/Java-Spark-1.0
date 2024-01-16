package HWQuestions;
//Write java program to count numbers of words in String ?
import java.util.Scanner;
public class WordInString
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a any String: ");

        String a=sc.nextLine();

        int count=1;

        for(int i=0;i<a.length()-1;i++)
        {
            if( (a.charAt(i)==' ') && (a.charAt(i+1)!=' ') )
            {
                count++;
            }
        }
        System.out.println("Number of words in a String: "+count);
    }
}
