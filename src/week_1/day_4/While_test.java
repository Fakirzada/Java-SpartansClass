package week_1.day_4;

import java.util.Scanner;

public class While_test {

    public static void main (String[] args){

        Scanner scanner= new Scanner(System.in);

        String  input= "";

        char intila='M';

        System.out.println(intila);



        while (true){
            System.out.println("Input");
            input=scanner.next().toLowerCase();

            if (input.equals("reset"))
                continue;
            if (input.equals(("quit")))
                break;;
                System.out.println(input);


        }


    }

}
