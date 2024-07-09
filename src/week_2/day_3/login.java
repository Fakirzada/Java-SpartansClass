package week_2.day_3;

import java.util.Scanner;

public class login {

    public static void main(String[] args){

        String vailduserName ="admin";
        String validpassword="pass";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter User Name");
        String userName =scanner.nextLine();
        System.out.println("Enter Password");
        String passWord = scanner.nextLine();

        if (userName.equals(vailduserName)){

            System.out.println("Successful Login ");
        }
        else {
            System.out.println("Invalid User And Pasword");

        }


    }
}
