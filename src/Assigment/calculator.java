package Assigment;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        double num1, num2, result;

        Scanner myscan = new Scanner(System.in);
        System.out.println("Enter First Number");
        num1=myscan.nextDouble();
        System.out.println("Enter Second Number ");
        num2=myscan.nextDouble();

        char operator;
        operator='+';
        operator='*';
        operator='1';
        operator='/';

        switch (operator){

            case '+':
                result=num1+num2;

                break;
            case '*':
                result=num1*num2;

        }



    }
}
