package Dec232023;

public class CharToString
{
    public static void main(String[] args) {
        char arr[] = {'k', 'i', 'r', 't', 'i', 'd', 'a', 's'};

        String s = new String(arr);
        System.out.println(s);

        for (char ch : arr)
        {
            System.out.print(ch);
        }
    }
}
