package week_12.LoopExample.DoWhileLoop;

import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {


       // compersion of ==  and equals
        String str1=new String("Hello");
        String  str2=new String("Hello");
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        // TEST
        int a=10;
        int b=20;
        System.out.println("Sum: "+(a+b));


        // Do WHILE lOOP
        int i =0;
        do {
            System.out.println("Number: "+i);
            i++;
        }
        while (i<5);

        //other email please of do whilr loop

        var scnner=new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter a number between 1= 10");
            number=scnner.nextInt();
            i++;

        }
        while (number<1|| number>10);
        System.out.println("Your Enter a vaild Number  "+number);




    }


}
