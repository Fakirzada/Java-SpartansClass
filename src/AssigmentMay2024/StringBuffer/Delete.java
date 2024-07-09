package AssigmentMay2024.StringBuffer;

public class Delete {
    /*
Question 4: Deleting Characters

    Create a StringBuffer object with the string "Hello World".
    Delete the character at index 5 (the space) using the deleteCharAt() method.
    Print the resulting string.

*/

    public static void main(String[] args) {
        java.lang.StringBuffer buffer=new java.lang.StringBuffer("hello world");
        System.out.println(buffer);
        buffer.delete(0,3);
        System.out.println(buffer);

    }
}