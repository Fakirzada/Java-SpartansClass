package week_8.loob;

import java.util.Scanner;

public class doWhileUserinput {
    public static void main(String[] args) {
        var myScanner=new Scanner(System.in);

        int number;

        do {
            System.out.println("Enter your number");
            number=myScanner.nextInt();

        } while (number<=0);
        System.out.println(number);
        number++;
        myScanner.close();


    }
}
