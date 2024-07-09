package Assignment2;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
       }
        int sum = 0; // Variable to store the sum of numbers
        int i = 1; // Variable to keep track of the current number

        // Use a while loop to iterate from 1 to n
        while (i <= n) {
            sum += i; // Add the value of i to sum
            i++; // Increment i by 1
        }
        System.out.println("The sum of numbers from 1 to " + n + " is: " + sum);
        scanner.close();
    }
}
