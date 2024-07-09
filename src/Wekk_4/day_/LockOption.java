package Wekk_4.day_;

import java.util.Scanner;

public class LockOption {

    public static void main(String[] args) {
        //boolean key=false;

        int doorPin =12345;

        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter Doors Pins");
        int enterping=scanner.nextInt();


        if (enterping== 12345){
            System.out.println("Door Open");
        }
        else {
            System.out.println("Worng pin Try agian");
        }






    }


}
