package Assigment.Test5pmClass.ReversedString;

public class ReversedString2 {
    public static void main(String[] args) {
        String origilan="hello world";
        String reversed="";


        for ( int i=origilan.length()-1;i>=0;i--){
            reversed+=origilan.charAt(i);

        }
        System.out.println(reversed);
    }
}
