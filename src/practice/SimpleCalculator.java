package practice;

import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

public class SimpleCalculator {

    static double  num1=0;
    static double num2=0;
    static double result;
    static double percent;

    static int userInput=0;
    static Scanner scanObj=new Scanner(System.in);

    public static void main(String[] args) {



        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("4. Division");
        System.out.println("5. Percentage");
        System.out.println("Select option below for operation");
        userInput=scanObj.nextInt();

        switch (userInput){
            case 1:
                EnterNumber();
                result=num1+num2;
                System.out.println("Result of: "+num1+ " + "+ num2+ " = "+result);
                break;
            case 2:
                EnterNumber();
                result=num1-num2;
                System.out.println("Result of: "+num1+ " - " + num2+ " = "+result);
                break;
            case 3:
                EnterNumber();
                result=num1*num2;
                System.out.println("Result of: "+num1+ " * "+ num2+ " = "+result);
                break;
            case 4:
                EnterNumber();

                if(num2!=0){
                    result=num1/num2;
                    System.out.println("Result of: "+num1+ " / "+ num2+ " = "+result);
                }
                else {
                    System.out.println("Division by zero is not allowed." + num1);
                }
                break;
            case 5:

                System.out.println("Enter Number");
                num1= scanObj.nextDouble();
                System.out.println("Enter Percentage");
                percent=scanObj.nextDouble();
                result=num1/100*percent;
                System.out.println(percent+"  Percentage Of: "+num1+" = "+result);
                break;
            default:
                System.out.println("Enter Invalid Option Please tray again!");
        }
    }

    public static void EnterNumber(){
        SimpleCalculator objec=new SimpleCalculator();
        System.out.println("Enter First Number");
        objec.num1= objec.scanObj.nextDouble();
        System.out.println("Enter Two Number");
        objec.num2= objec.scanObj.nextDouble();


    }
}
