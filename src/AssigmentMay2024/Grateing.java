package AssigmentMay2024;

import java.util.Scanner;

public class Grateing {

    public static void main(String[] args) {

        var mysacn = new Scanner(System.in);
        int grate = 0;

        System.out.println("Enter Stuned grate between 100 to 60");
        grate=mysacn.nextInt();

        if (grate>=100){

            System.out.println("Your Grate is : A");
        } else if (grate>=80) {
            System.out.println("Your Grate is : B");
        } else if (grate>=70) {
            System.out.println("Your Grate is : c");
        } else if (grate>=60) {
            System.out.println("Your Grate is : c");
        }
        else {
            System.out.println("Your Grate is : F");
        }


    }
}
