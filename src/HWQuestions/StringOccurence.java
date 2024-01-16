package HWQuestions;
//write a java program to remove all occurence of given char ?
public class StringOccurence
{
    public static void main(String[] args) {

               /*
                // Original string

                String originalString = "Hello, world! Hello, Java!";

                // Character to be removed
                char charToRemove = 'o';

                // Remove all occurrences of the given character
                String modifiedString = originalString.replace(String.valueOf(charToRemove), "");

                // Print the modified string
                System.out.println("Original String: " + originalString);
                System.out.println("Modified String: " + modifiedString);


                */

        String s="Kirtidas world";
        char y[]=s.toCharArray();
        int size=s.length();
        char key='r';

        int i= 0;
        String res ="";

        while(i !=size)
        {
            if (y[i] != key)
            {
                res = res + y[i];
            }
            i++;
        }
        System.out.println(res);

    }
}
