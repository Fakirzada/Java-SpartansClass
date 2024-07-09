package week_8.loob;

import java.util.Scanner;

public class ArrayWithuserInput {
    public static void main(String[] args) {

        var myobj=new Scanner(System.in);
        System.out.println("Enter you avlue");
       int userInput=myobj.nextInt();
        int [] numbers=new int[userInput];
        for ( int value=1; value<=numbers.length;value++){

            if (value % 2==0) {

                numbers[value - 1] = value;
            }
        }

        for (int eacharry:numbers){

            System.out.println(eacharry);
        }

    }
}
