package Assigment.Test5pmClass.ArraySizeUsedScanner;

import java.util.Scanner;

public class ArraySizeuaseScanner {
    public static void main(String[] args) {

        var scanner=new Scanner(System.in);
        System.out.println("Enter Size Of Array");
        int size=scanner.nextInt();
        String[] str=new String[size];


        for( int i=0; i<size;i++){
            System.out.println("Enter "+size+" Elements "+( i+1 )+" : ");
            str[i]=scanner.next();
        }

        int count=1;
        for ( String print:str){
            System.out.println(count+" >> "+print);
            count++;
        }
    }
}
