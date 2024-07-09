package Assigment.Test5pmClass;

import java.util.Random;

public class TestSwap {
    // Define the characters to use for generating random strings
    private static final String CHARACTERS = "redbuleyellow";

    static String [] ballArray={"Red","Blue","green"};

    public static void main(String[] args) {
        // Size of the array and length of each random string
        int arraySize = 10;
        int stringLength = 8;

        // Create the array
        String[] randomStrings = new String[arraySize];

        // Fill the array with random strings
        fillArrayWithRandomStrings(randomStrings, stringLength);

        // Print the resulting array
        for (String str : randomStrings) {
            System.out.println(str);
        }
    }

    // Method to fill an array with random strings
    private static void fillArrayWithRandomStrings(String[] array, int stringLength) {
       // Random random = new Random();
        Random random=new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = generateRandomString(random, stringLength);
        }
    }

    // Method to generate a random string of a given length
    private static String generateRandomString(Random random, int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(CHARACTERS.length());
            sb.append(CHARACTERS.charAt(index));
        }
        return sb.toString();
    }
}
