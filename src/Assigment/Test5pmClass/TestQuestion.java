package Assigment.Test5pmClass;

public class TestQuestion {

    public static void main(String[] args) {
         String sechetword="Hello";
        int count=0;
        String[] words = {"Hello", "World","School"};
        for( String word:words){

            if ( word.equals(sechetword)){
                count++;

            }
        }
        System.out.println(count);


    }


}
