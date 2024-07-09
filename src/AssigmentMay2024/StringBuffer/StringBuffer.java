package AssigmentMay2024.StringBuffer;

public class StringBuffer {

    /*
    Question 1: Basic StringBuffer Initialization

    Create a StringBuffer object with an initial string "Hello".
    Append the string " World" to the StringBuffer object.
    Print the resulting string.
     */


    public static void main(String[] args) {

        StringBuilder strinBuffer = new StringBuilder("HELLO");
        strinBuffer.append(" World");
        System.out.println(strinBuffer);
    }


}