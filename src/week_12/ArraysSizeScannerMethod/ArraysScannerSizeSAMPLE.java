package week_12.ArraysSizeScannerMethod;
import  java.util.Scanner;
import javax.crypto.spec.PSource;

public class ArraysScannerSizeSAMPLE {
    public static void main(String[] args) {
        var myScanner=new Scanner(System.in);
        System.out.println("ENTER ARRAYS SIZE!");
        int size =myScanner.nextInt();
        String[] str=new String[size];

        //System.out.println("Your Arrays Size is:"+size +"Enter you Elements");

        for ( int i=0;i<size;i++){

            System.out.print("Enter"+size+"Element"+(i+1)+": ");
            str[i]=myScanner.next();

        }
        for( String print :str){
            System.out.println(print);
        }
    }
}
