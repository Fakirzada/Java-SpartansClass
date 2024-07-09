package Assigment.Test5pmClass;

import java.util.Scanner;

public class SwappingElementBWtwoString {

    static String [] arrays1={"Apple","Banana","cherry"};
    static String[] arrays2={"Date","Elderberry","Fig"};
    public static void main(String[] args) {

        printinfo();

        System.out.println("Enter index Adreess");
        var scanner=new Scanner(System.in);
        int inputIndex=scanner.nextInt();
        waspElementsBWArray(arrays1,arrays2,inputIndex);
       // System.out.println("Origral Array1: "+arrays1);
        System.out.println("After Array1: "+ java.util.Arrays.toString(arrays1));
        System.out.println("After Array2: "+ java.util.Arrays.toString(arrays2));

    }
    public static void waspElementsBWArray(String[]array1,String[]array2, int index){

        System.out.println("Enter index Adreess");
        String team= array1[index];
        array1[index]=array2[index];
        array2[index]=team;
    }

    public static void  printinfo(){
         for( String arr1:arrays1 ){
             System.out.print( arr1+" ");
         }
        System.out.println();

         for(String arr2:arrays2){

             System.out.print(arr2+" " );
         }
        System.out.println();

    }


}
