package Assigment;

import java.util.Scanner;

public class ScannerNumber {
    public static void main(String[] args) {


        var mysacn=new Scanner(System.in);
        System.out.println("Enter The First Number ");
        double fistnumber=mysacn.nextDouble();
        System.out.println("Enter The Second Number ");
        double seconNumber=mysacn.nextDouble();
        System.out.println("Enter The Thrid Number ");
        double thirdNumber=mysacn.nextDouble();

        double sumResult= fistnumber+seconNumber+thirdNumber;

        if( sumResult>= 100){
            System.out.println("Sum of numbers is bigger than 100");

        }
        else {
            System.out.println("Sum of numbers is smaller than 100");
        }
        System.out.println("______________________________");
        System.out.println("Firt Number:  "+ fistnumber);
        System.out.println("Second Number: "+ seconNumber);
        System.out.println("Third Number: "+ thirdNumber);


    }
}
