package week_1.day_1;
import java.util.Scanner;
public class lofgin {
    public  static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String vaildUserName ="admin";
        String validPassword ="password";
        System.out.println("wellcome to the login page");
        System.out.println("Enter USER");
        String user=scanner.nextLine();
        System.out.println("Enter password");
        String password=scanner.nextLine();

        if (user.equals(vaildUserName)&& password.equals(validPassword)) {
            System.out.println("login Successful");
        }
        else {
            System.out.println("Invalid user and password");
        }
        scanner.close();
    }
}
