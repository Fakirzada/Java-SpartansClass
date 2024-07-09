package Assigment.Test5pmClass.CountWords;

import java.util.Scanner;

public class countwords {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        String  str="hello the world world";
        System.out.println("Enter world you would like to search");
        String search=scanner.next();

        int count=0;

        for ( String word:str.split(" ")){
            if ( word.equals(search)){
                count++;
            }
        }
        System.out.println(count);
    }
}
