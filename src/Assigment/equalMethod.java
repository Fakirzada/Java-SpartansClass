package Assigment;

import java.util.Scanner;

public class equalMethod {
    public static void main(String[] args) {
        var myscanner=new Scanner(System.in);
        System.out.println("What is your name");
         String name=myscanner.next();

         if ( name.equals("Daniel")){

             System.out.println("You are Daniel");
         }
         else {
             System.out.println("Your are not Daniel");
         }
    }
}
