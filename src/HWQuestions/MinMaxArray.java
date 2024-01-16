package HWQuestions;
//Write a program to find min and Max element of an array
public class MinMaxArray
{
    public static void main(String[] args) {

                // Declare and initialize an array
                int[] numbers = {5, 2, 8, 1, 4, 9, 3};

                // Find and print the minimum and maximum elements
                findMinMax(numbers);
            }

            // Method to find and print the minimum and maximum elements of an array
            static void findMinMax(int[] arr) {
                // Check if the array is not empty
                if (arr.length == 0) {
                    System.out.println("Array is empty");
                    return;
                }

                int min = arr[0];  // Assume the first element is the minimum
                int max = arr[0];  // Assume the first element is the maximum

                // Iterate through the array to find the minimum and maximum elements
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] < min) {
                        min = arr[i];
                    } else if (arr[i] > max) {
                        max = arr[i];
                    }
                }

                // Print the results
                System.out.println("Minimum element: " + min);
                System.out.println("Maximum element: " + max);



    }
}
