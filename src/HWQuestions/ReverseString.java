package HWQuestions;
//Write java program to reverse a string ?
public class ReverseString
{
    public static void main(String[] args)
    {
        /* StringBuffer a=new StringBuffer("Kirtidas");

        a.reverse();
        System.out.println(a);
    */

       /* int n=1234;

        while(n>0)
        {
            int lastdigit= n%10;
            System.out.print(lastdigit + " ");
            n=n/10;
        }
        System.out.println();
    */


                String n ="Kirtidas";
                // Iterate through the characters of the string in reverse order
                for (int i = n.length() - 1; i >= 0; i--) {
                    char a= n.charAt(i);
                    System.out.print(a + " ");
                }


    }
}
