package week_12.ArraysSizeScannerMethod;
import java.util.Arrays;
import java.util.Scanner;
public class ArraysSizeScannerMethod {
    private static Scanner mysacnner=new Scanner(System.in);
    private static  int size=mysacnner.nextInt();
    private static   String[] arrays=new String[size];

    public static void main(String[] args) {
        //print();

        String printvale= Arrays.toString(methodString(arrays));
        System.out.println(printvale);
    }

    public static String[] methodString (String[] arrays){
        System.out.println("Enter Your Element Values ");
        for ( int i =0;i<size;i++){
            System.out.println("Enter"+size+"element"+ (i+1)+": ");
            ArraysSizeScannerMethod.arrays[i]=mysacnner.next();
        }
        return arrays;
    }

    public static void print(){
       for(String print:arrays){
           System.out.println(print);
       }
    }


}


