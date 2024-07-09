package week_7.day_2;

import java.util.Scanner;

public class ArrayOddEvenNumber {
    public static void main(String[] args) {


        var mysacn= new Scanner(System.in);

        int userInput;

        int [] numbers ={10,2,34,5,8,12,3,4,7};

        System.out.println("1, Print Even Number");
        System.out.println("2, print Odd number");
        System.out.println("Select one of the option");
        userInput=mysacn.nextInt();

        if ( userInput !=1 && userInput!=2){
            System.out.println("Invalied entry Please one of the above option");

        }
        switch (userInput){

            case 1:

                int countEven=0;
                for ( int number: numbers){
                    if (number%2==0){
                        System.out.println("Even Numbers:   "+ number);
                        countEven++;
                    }

            }
                break;
            case 2:
                int countodd=0;
                for (int number: numbers){

                    if (number%2!=0){

                        System.out.println("Odd Numbers:  "+ number );
                        countodd++;


                    }

                }
                break;
            default:
            {

                System.out.println("Invalied Entery ");
            }

        }




    }
}
