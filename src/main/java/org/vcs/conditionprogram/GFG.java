package org.vcs.conditionprogram;// Java program to find three numbers
// such that sum of two makes the
// third element in array
import java.util.Arrays;

public class GFG
{
    // Utility function for finding
    // triplet in array
    static void findTriplet(int arr[], int n)
    {
        // Sort the array
        Arrays.sort(arr);

        // For every element in arr check
        // if a pair exist(in array) whose
        // sum is equal to arr element
        for (int i = n - 1; i >= 0; i--)
        {
            int j = 0;
            int k = i - 1;
            while (j < k) {
                if (arr[i] == arr[j] + arr[k])
                {
                    // Pair found
                    System.out.println("numbers are " + arr[i] +
                            " " + arr[j] + " " + arr[k]);
                    return;
                }
                else if (arr[i] > arr[j] + arr[k])
                    j += 1;
                else
                    k -= 1;
            }
        }

        // No such triplet is found in array
        System.out.println("No such triplet exists");
    }

    // Driver code
    public static void main(String args[])
    {
        int arr[] = {2,19,21,32};
        int n = arr.length;
        findTriplet(arr, n);
    }
}
// This code is contributed by Sumit Ghosh
