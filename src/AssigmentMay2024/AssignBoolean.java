package AssigmentMay2024;

import java.util.Scanner;

public class AssignBoolean {
    public static void main(String[] args) {

        String butten="";
        var  mysacn= new Scanner(System.in);
        boolean off= false;
        boolean on=true;

        System.out.println("Select the option Light On/Off ");
        butten=mysacn.next();

        if ( !butten.equals("on")){

            System.out.println("Select one of above options");
        }
         if (butten.equals("on"))
         {
             System.out.println("Your Light is On");
         }
         else {
             System.out.println("Your Light is Off");
         }




    }
}
