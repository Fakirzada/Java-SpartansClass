package week_1.day_1;

import java.util.Scanner;

public class TrafficLight {
    public  static void main (String[] args){

        String light= "green";

        if (light == "resd"){
            System.out.println("stop behind light");
        } else if (light== "green") {
            System.out.println("Go past the light");
        }
        else {
            System.out.println("Go past the light");
        }


        // school grade

        //Scanner scanner =new Scanner(System.in);
        int mark =96;
        String grade;
        //System.out.println("Enter grade");
        //String marks= scanner.nextLine();

        if (mark>95){
            grade="A";

        } else if (mark>80) {
            grade="B";
        } else if (mark>70){
            grade="C";

        }
        else {

            grade="F";
        }
        System.out.println(grade);


    }



}
