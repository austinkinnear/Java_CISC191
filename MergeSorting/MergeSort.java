/**
 * Author: Austin Kinnear, CISC 191 Intermediate Java Programming
 * Programming Project: Creating a merge sorting algorithm
 */
import java.util.Scanner;

public class MergeSort {
    // Main function that sorts arr[l..r] using merge()
    void sort(int arr[], int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = (l + r) / 2;
            
            // Sort first and second halves recursively 
            sort(arr, l, m);
            sort(arr, m + 1, r);
            
            // Merges the sorted halves
            merge(arr, l, m, r);
        }
    }
    
    // Function to merge the two halves
    void merge(int arr[], int l, int m, int r) {
        // Size of the left and right array
        int n1 = m - l + 1; 
        int n2 = r - m; 

        // Temporary arrays for left and right
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copies data to the temporary left and right array
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        // Initial indexes of the sub arrays
        int i = 0, j = 0;
        int k = l;

        // Merge the temporary arrays into orgional case
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copies remaining left array elements
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copies ramaining right array elements
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Utility function to print the array
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " "); 
        System.out.println();
    }

    // Driver method to take user input and sort
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements:");
        int n = scanner.nextInt();
        
        int arr[] = new int[n]; // Creates array of size n 

        System.out.print("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Given Array:");
        printArray(arr);
        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array:");
        printArray(arr);
        scanner.close();
    }
}
