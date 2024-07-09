package Assigment;

import java.util.Scanner;

public class SwitchSatament2 {

    public static void main(String[] args) {
        var myscanner=new Scanner(System.in);
        System.out.println("Enter name");

      String a=myscanner.next();

        System.out.println("Enter case number");
        int name=myscanner.nextInt();

        switch (name){

            case 1:
                if (a.equals("John")){
                    System.out.println("His Is your Setudent");
                }
                else
                {
                    System.out.println("is not student of this class");
                }
                break;
            case 2:
                if (a.equals("Smith")){
                    System.out.println("Is your Setudent");
                }
                else
                {
                    System.out.println("is not student of this class");
                }
                break;
            case 3:
                if (a.equals("Benjamin")){
                    System.out.println("Is your Setudent");
                }
                else
                {
                    System.out.println("is not student of this class");
                }
                break;

            case 4:
                if (a.equals("Emily")){
                    System.out.println("Is your Setudent");
                }
                else
                {
                    System.out.println("is not student of this class");
                }
                break;
            case 5:
                if (a.equals("Oscar")){
                    System.out.println("Is your Setudent");
                }
                else
                {
                    System.out.println("is not student of this class");
                }
                break;
            case 6:
                if (a.equals("Emma")){
                    System.out.println("Is your Setudent");
                }
                else
                {
                    System.out.println("is not student of this class");
                }
                break;
            case 7:
                if (a.equals("Heidi")){
                    System.out.println("Is your Setudent");
                }
                else
                {
                    System.out.println("is not student of this class");
                }
                break;
            default:
                System.out.println("Enter invalied ");

        }

    }

}
