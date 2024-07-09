package Assignment2;

import java.util.Scanner;

public class Multipaction {
    public static void main(String[] args) {

        int startpoint=1;
        int endPoint=10;
        int userInput=0;
        var scanOj=new Scanner(System.in);
        System.out.println("Please  Enter a base Number for multiplication ");
        userInput=scanOj.nextInt();
        for (int i=startpoint;i<=endPoint;i++){

            System.out.println(i+"*"+ userInput+"="+(i*userInput));
        }

    }
}
