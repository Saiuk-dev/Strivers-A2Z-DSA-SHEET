import java.util.*;

public class SecondlargestinArray {

    // Function to find the second largest element in an integer array
    public static int findSecondLargest(int[] nums) {

        // Initialize 'max' to store the largest value
        // Initialize 'secondMax' to store the second largest value
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        // Loop through each element in the array
        for (int i = 0; i < nums.length; i++) {
            // If current number is greater than max, update both max and secondMax
            if (nums[i] > max) {
                secondMax = max;  // max becomes second largest
                max = nums[i];    // update max
            }
            // If current number is less than max but greater than secondMax
            else if (nums[i] > secondMax && nums[i] != max) {
                secondMax = nums[i]; // update secondMax
            }
        }

        // If secondMax was never updated (all elements are equal), return -1
        return (secondMax == Integer.MIN_VALUE) ? -1 : secondMax;
    }

    // Main method to test the function
    public static void main(String[] args) {
        // Sample input array
        int[] nums = {3, 7, 5, 8, 2, 0, 12, 4, 67, 34};

        // Call the function and print the result
        System.out.println("The 2nd largest element in the array is: " + findSecondLargest(nums));
    }
}
