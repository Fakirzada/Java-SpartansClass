package Assigment.Test5pmClass;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class StringRoundForAuntitaction {

    public static void main(String[] args) {
       String[]wordlist={"A","B","J","K"};

        //Random random=new Random();
        String[] name={"Ali","Khan","jan"};

        LinkedList<String> listname=new LinkedList<>();

        for ( int i=0;i<name.length;i++){
            listname.add(name[i]);

            //listname.add(random[i]);
        }
        System.out.println(listname);


        // Create a LinkedList to hold Integer values
        List<Integer> linkedList = new LinkedList<>();
        // Create a Random object
        Random random = new Random();
        // Specify the number of random values you want to add
        int numberOfElements = 4;
        // Fill the LinkedList with random values using a for loop
        for (int i = 0; i < numberOfElements; i++) {
            // Generate a random integer
            int randomValue = random.nextInt(100); // Random value between 0 and 99
            // Add the random value to the LinkedList
            linkedList.add(randomValue);
        }
        // Print the LinkedList to see the random values
        System.out.println("LinkedList filled with random values: " + linkedList);






    }


}
