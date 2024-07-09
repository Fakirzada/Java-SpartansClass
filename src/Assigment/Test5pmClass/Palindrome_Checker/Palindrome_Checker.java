package Assigment.Test5pmClass.Palindrome_Checker;

public class Palindrome_Checker {
    private String str;

    public Palindrome_Checker(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public void print() {
        System.out.println(isPalindrome(str));
    }

    public static void main(String[] args) {
        // Test cases
        Palindrome_Checker palindromeChecker1 = new Palindrome_Checker("madam");
        palindromeChecker1.print(); // Output: true

        Palindrome_Checker palindromeChecker2 = new Palindrome_Checker("hello");
        palindromeChecker2.print(); // Output: false

        Palindrome_Checker palindromeChecker3 = new Palindrome_Checker("racecar");
        palindromeChecker3.print(); // Output: true

        Palindrome_Checker palindromeChecker4 = new Palindrome_Checker("A man a plan a canal Panama");
        // Preprocess the string to ignore spaces and make it case-insensitive
        String preprocessedStr = palindromeChecker4.getStr().replaceAll("\\s+", "").toLowerCase();
        Palindrome_Checker palindromeChecker5 = new Palindrome_Checker(preprocessedStr);
        palindromeChecker5.print(); // Output: true
    }
}
