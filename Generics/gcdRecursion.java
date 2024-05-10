/** 
 * Author: Austin Kinnear, CISC 191 Intermediate Java Programming  
 * Programming Project: Recursion method to find GCD
*/
import java.util.Scanner;
public class gcdRecursion {

    // Using Recursion to calculate the GCD
    public static int gcd(int m, int n) {
        if (n == 0) {
            return m; 
        } else {
            return gcd(n, m % n);  
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User prompt so we can test for 3 and 7 
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt(); 
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        scanner.close();

        // Basic print statement which will be seen in the terminal
        System.out.println("The GCD of " + num1 + " and " + num2 + " is " + gcd(num1, num2));
    }
}
