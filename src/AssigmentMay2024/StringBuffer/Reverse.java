package AssigmentMay2024.StringBuffer;

public class Reverse {
    /*
    Question 3: Reversing a String

    Create a StringBuffer object with the string "OpenAI".
    Reverse the string using the reverse() method.
    Print the reversed string.
     */



    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder("OpenAI");
        System.out.println("Origianl: "+builder);
        builder.reverse();
        System.out.println("reversed: "+builder);
    }

}
