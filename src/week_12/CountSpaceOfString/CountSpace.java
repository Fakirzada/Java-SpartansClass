package week_12.CountSpaceOfString;

public class CountSpace {

    public static void main(String[] args) {

        // Sample string
        String str = "Hello, World! How are you today?";

        System.out.println("Number of spaces:"+countSpaces(str));

        System.out.println(str.charAt(str.length()-1) );



        System.out.println(str.replaceAll("[^A-Za-z]","") );
    }

    // Method to count spaces in a string
    public static int countSpaces(String str) {
        int count = 0; // Initialize the count to 0

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            // Check if the character is a space
            if (str.charAt(i) == ' ') {
                count++; // Increment the count if the character is a space
            }
        }

        return count; // Return the total count of spaces
    }
}
