/** 
 * Author: Austin Kinnear, CISC 191 Intermediate Java Programming  
 * Programming Project: Generics where a method that sorts an ArrayList
*/
import java.util.ArrayList;
import java.util.Scanner;

public class SortArrayList {
    // Method to sort an ArrayList the elements extend to comparable
    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        list.sort(null);  // Sorting the list using natural ordering
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer>numbers = new ArrayList<>();

        // Terminal prompts user to enter 10 integers
        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < 10; i++) {
            numbers.add(scanner.nextInt());
        }

        // Sort the numbers using the sort method
        sort(numbers);

        // Display the sorted numbers
        System.out.print("The sorted numbers are ");
        for (int number : numbers) {
            System.out.print(number+ " ");
        }
        scanner.close();
    }
}
