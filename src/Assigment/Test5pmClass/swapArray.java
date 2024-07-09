package Assigment.Test5pmClass;

import java.util.Random;
import java.util.Scanner;

public class swapArray {

    static String[] ballArray = {"Red", "Bule", "orange", "green"};
    static String[] array1;
    static String[] array2;
    static String team;
    static int index;

    public static void main(String[] args) {
      fillmethod();
        var scanner = new Scanner(System.in);
        int select = 1;

        //team=scanner.next();
        System.out.println("Enter Index");
        index = scanner.nextInt();
        swap(array1, array2, index);

        System.out.println("After Array1: " + java.util.Arrays.toString(array1));
        System.out.println("After Array2: " + java.util.Arrays.toString(array2));

    }
     public static void fillmethod() {

        Random random=new Random();
         for (int row = 0; row < ballArray.length; row++) {
                 //String randomnumber = random.nextBoolean();


               //  array1[row] = randomnumber;
         }
         for( String print:array1){
             System.out.println(print);
         }
     }
    public static void swap(String[] array1, String[] array2, int index) {

        team = array1[index];
        array1[index] = array2[index];
        array2[index] = team;

    }

}