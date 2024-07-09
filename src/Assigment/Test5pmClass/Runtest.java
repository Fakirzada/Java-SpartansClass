package Assigment.Test5pmClass;

import java.util.Scanner;

public class Runtest implements Animal {


    public static void main(String[] args) {

        var sanner=new Scanner(System.in);
        System.out.println("Enter Arrays value");
        int [] arrys= new int[3];

        arrys[0]=sanner.nextInt();
        arrys[1]=sanner.nextInt();
        arrys[2]=sanner.nextInt();


        for( int number:arrys){
            System.out.print(number+" ");
        }

        System.out.println(breed);
    }
}
