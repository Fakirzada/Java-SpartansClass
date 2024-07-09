package Arraylist;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class LinkListRandomFill {
    public static void main(String[] args) {
        // Create a LinkedList to hold Object values (since we are mixing types)
        List<Object> linkedList = new LinkedList<>();
        // Create a Random object
        Random random = new Random();
        // Define an array of possible strings
       // String[] possibleStrings = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};
        char[] possibleStrings = {'A', 'B', 'C', 'D', 'E'};
        // Specify the number of random values you want to add
        int numberOfElements = 6;

        // Fill the LinkedList with random values using a for loop
        for (int i = 0; i < numberOfElements; i++) {
            // Randomly decide whether to add an integer or a string
            if (random.nextBoolean()) {
                // Add a random integer
                int randomValue = random.nextInt(9); // Random value between 0 and 99
                linkedList.add(randomValue);
            } else {
                // Select a random index from the possibleStrings array
                int randomIndex = random.nextInt(possibleStrings.length);
                // Add the random string
                linkedList.add(possibleStrings[randomIndex]);
            }
        }
        // Print the LinkedList to see the random values
       // System.out.println("LinkedList filled with random integers and strings: " + linkedList);
         for (Object print:linkedList){

             System.out.print(print);
         }

    }


}
