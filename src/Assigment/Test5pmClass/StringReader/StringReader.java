package Assigment.Test5pmClass.StringReader;


import java.io.IOException;

public class StringReader {
    public static void main(String[] args) {
        String input = "Hello, StringReader!";

        java.io.StringReader reader=new java.io.StringReader(input);
       // StringReader reader = new StringReader(input);

        try {
            int data;
            while ((data = reader.read()) != -1) {
                char ch = (char) data;
                System.out.print(ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            reader.close();
        }
    }



}
