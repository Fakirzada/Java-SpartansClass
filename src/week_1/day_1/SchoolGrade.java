package week_1.day_1;

import java.util.Scanner;

public class SchoolGrade {

public static void main(String[] args){


    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter grade");
    int result=scanner.nextInt();
    //double result1=scanner.nextDouble();

    int mark=90;
    double mark1=79.99;
    int mark2=60;
    String grade;


        if (result>mark){
            System.out.println("Grade is: A");

        } else if (result>mark1) {

            System.out.println(" Grade is: B");
        } else if (result>mark2) {

            System.out.println("Grade is: C");

        } else {

            System.out.println("Grade is: F");
        }
        scanner.close();


}



}
