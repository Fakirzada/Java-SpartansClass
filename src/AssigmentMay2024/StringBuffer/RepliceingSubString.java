package AssigmentMay2024.StringBuffer;

public class RepliceingSubString {

    /*
    Question 5: Replacing a Substring

    Create a StringBuffer object with the string "Hello Java".
    Replace "Java" with "World" using the replace() method.
    Print the resulting string.
     */

    public static void main(String[] args) {
        java.lang.StringBuffer buffer=new java.lang.StringBuffer("hello java");
        int star=buffer.indexOf("java");
        int end=star+"java".length();
        buffer.replace(star,end,"World");
        System.out.println(buffer);
    }
}
