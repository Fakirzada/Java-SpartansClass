package Assigment.Test5pmClass;

import java.util.Random;

public class RandombasedOnWords {

    public static void main(String[] args) {
        // List of words to choose from
        String[] wordList = {"Red", "Blue", "Green"};
        // Size of the array

        int arraySize = 8;

        // Create the array
        String[] randomWords = new String[arraySize];
        String[]randomWords1=new String[arraySize];
        String[]randomWords2=new String[arraySize];
        System.out.print("");

        System.out.println("******_____Cylinder 1______******");
        fillArrayWithRandomWords(randomWords1,wordList);
        for (String word:randomWords1){
            System.out.println(word+" ");
        }
        System.out.print("");
        System.out.println("******_____Cylinder 2______******");
        // Fill the array with random words
        fillArrayWithRandomWords(randomWords, wordList);
        // Print the resulting array
        for (String word : randomWords) {
            System.out.println(word);
        }
        waspElementsBWArray(randomWords2,randomWords,0);
        System.out.print("");
        System.out.println("******_____Cylinder 3______******");
        // Fill the array with random words
        //fillArrayWithRandomWords(randomWords, wordList);
        // Print the resulting array
        for (String word : randomWords2) {
            System.out.println(word);
        }

    }
    // Method to fill an array with random words from a given list
    private static void fillArrayWithRandomWords(String[] array, String[] wordList) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int index = random.nextInt(wordList.length);
            array[i] = wordList[index];
        }
    }
    public static void waspElementsBWArray(String[]array1,String[]array2, int index){

       // System.out.println("Enter index Adreess");
        String team= array1[index];
        array1[index]=array2[index];
        array2[index]=team;
    }
}
