package HWQuestions;
//write java program to find the char occurence  given by user ?
import java.util.Scanner;

    public class CharOccurence {
        public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);

            // Get input string from the user
            System.out.println("Enter a string: ");
            String inputString = sc.nextLine();

            // Get the character to find its occurrence
            System.out.println("Enter a character to find its occurrence: ");
            char charToFind = sc.next().charAt(0);

            // Call the method to count occurrences
            int occurrences = countOccurrences(inputString, charToFind);

            // Display the result
            System.out.println("The character '" + charToFind + "' occurs " + occurrences + " times in the string.");
        }

        private static int countOccurrences(String str, char targetChar) {
            int count = 0;

            // Loop through each character in the string
            for (int i = 0; i < str.length(); i++) {
                // Check if the current character is equal to the target character
                if (str.charAt(i) == targetChar) {
                    count++;
                }
            }

            return count;

            /*
            //second method
            String s="Welcome to the my world";

            int totalcount=s.length();
            int totalcount_afterRemove =s.replace("o","").length();

            int count=totalcount - totalcount_afterRemove;

            System.out.println("Number of occurences is: "+ count);

             */
        }
    }



