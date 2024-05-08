import java.util.Scanner;

public class gcdRecursion {

    // Recursive method to calculate the GCD of two numbers
    public static int gcd(int m, int n) {
        if (n == 0) {
            return m;  // Base case: if m % n is 0, return n
        } else {
            return gcd(n, m % n);  // Recursive call
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting user to enter two integers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        scanner.close();

        // Displaying the GCD
        System.out.println("The GCD of " + num1 + " and " + num2 + " is " + gcd(num1, num2));
    }
}
