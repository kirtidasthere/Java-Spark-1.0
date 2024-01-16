package HWQuestions;

public class SecondMinMaxArray
{
        public static void main(String[] args) {
            // Declare and initialize an array
            int[] numbers = {5, 2, 8, 1, 4, 9, 3};

            // Find and print the minimum, maximum, second minimum, and second maximum elements
            findMinMax(numbers);
        }

        // Method to find and print the minimum, maximum, second minimum, and second maximum elements of an array
        static void findMinMax(int[] arr) {
            // Check if the array is not empty
            if (arr.length == 0) {
                System.out.println("Array is empty");
                return;
            }

            int min = Integer.MAX_VALUE;  // Initialize to a large value
            int secondMin = Integer.MAX_VALUE;  // Initialize to a large value
            int max = Integer.MIN_VALUE;  // Initialize to a small value
            int secondMax = Integer.MIN_VALUE;  // Initialize to a small value

            // Iterate through the array to find the minimum, maximum, second minimum, and second maximum elements
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    secondMin = min;
                    min = arr[i];
                } else if (arr[i] < secondMin && arr[i] != min) {
                    secondMin = arr[i];
                }

                if (arr[i] > max) {
                    secondMax = max;
                    max = arr[i];
                } else if (arr[i] > secondMax && arr[i] != max) {
                    secondMax = arr[i];
                }
            }

            // Print the results
            System.out.println("Minimum element: " + min);
            System.out.println("Second Minimum element: " + (secondMin == Integer.MAX_VALUE ? "N/A" : secondMin));
            System.out.println("Maximum element: " + max);
            System.out.println("Second Maximum element: " + (secondMax == Integer.MIN_VALUE ? "N/A" : secondMax));
        }


}
