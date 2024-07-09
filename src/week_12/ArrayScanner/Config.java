package week_12.ArrayScanner;

import java.util.Scanner;

public class Config {



    public static void main(String[] args) {

        var sacanObj=new Scanner(System.in);

        System.out.println("Enter Size Array");
        int size=sacanObj.nextInt();

        String [] array=new String[size];

        System.out.println("Your Size Arrays is: "+size);

        for (int i = 0; i < size; i++) {
            array[i] = sacanObj.next();

        }


        for (String  print :array){

            System.out.println(print);
        }

    }





}
