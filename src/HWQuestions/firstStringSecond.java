package HWQuestions;
//Write java program to check first string is present in second string ?
public class firstStringSecond
{
    public static void main(String[] args) {

        String firstString="Hello";
        String secondstring="Hello World";

        if (secondstring.contains(firstString))
        {
            System.out.println("First String is present in second String ");
        }
        else
        {
            System.out.println("First string not present in second string");
        }
    }
}

