package week_11.Lab.CountChartor;

public class CountChartar {


    long count=0;
    String str=" Hell the Word";

    public static void main(String[] args) {
        String str="Hell the Word dd";
        System.out.println(str.replaceAll("[^A-Z]","").length());
        System.out.println(str.replaceAll("[^A-Z]",""));
        System.out.println(str.replaceAll("[^a-z]","").length());
        System.out.println(str.replaceAll("[^a-z]",""));
        System.out.println(str.length());


        String number=(" hheellle @  a^^^*&* (12345689");

        System.out.println(number.replaceAll("[^1-9]",""));
        System.out.println(number.replaceAll("[^1-9]","").length());
         /// print sambols
        System.out.println(number.replaceAll("[A-Z,a-z]",""));

        System.out.println(str.split(" ").length);











        // Sample string
        String str1 = "Hello, World! This is a Java Program.";

        // Call the method to count uppercase letters
        int uppercaseCount = countUppercaseLetters(str1);

        // Print the result
        System.out.println("Number of uppercase letters: " + uppercaseCount);
    }

    // Method to count uppercase letters in a string
    public static int countUppercaseLetters(String str1) {
        int count = 0; // Initialize the count to 0

        // Loop through each character in the string
        for (int i = 0; i < str1.length(); i++) {
            // Check if the character is uppercase
            if (Character.isUpperCase(str1.charAt(i))) {
                count++; // Increment the count if the character is uppercase
            }
        }

        return count; // Return the total count of uppercase letters
    }




}
