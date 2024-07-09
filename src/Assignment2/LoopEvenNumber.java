package Assignment2;

import java.util.Scanner;

public class LoopEvenNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        int sum = 0; // Variable to store the sum of numbers
       // int i; // Variable to keep track of the current number

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) { // Check if the number is even
                System.out.println(i); // Print the even number
            }
        }
        scanner.close();
    }
}
