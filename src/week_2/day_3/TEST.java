package week_2.day_3;

import javax.swing.plaf.PanelUI;
import java.util.Scanner;

public class TEST {
    public static void main(String[] agrs){



        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcom to the Calculator App!");
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter scond umber:");
        double num2 = scanner.nextDouble();
        System.out.println("Select an opertion (+,-,/,*,>,%):");

        char operation = scanner.next().charAt(0);
        double result=0;
        switch ((operation)){

            case '+':
                result = num1+num2;
                break;
            case '-':
                result=num1-num2;
                break;
            case '*':
                result=num1*num2;
                break;
            case '/':
                if ( num2!=0){

                    result=num1/num2;
                }
                else {

                    System.out.println("Error: Division by zero is not allowed");
                    return;
                }
                break;

            case '>':

                result= Math.max(num1,num2);
                break;
            case '%':

                System.out.println("Enter Precentage");
                double percentage=scanner.nextDouble();
                result=(num1+num2)/100*percentage;
                break;

            default:
                System.out.println("Error: Invalid operation");
                return;
        }
        System.out.println("Result: "+result);



    }
}
