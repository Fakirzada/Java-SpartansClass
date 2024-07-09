package Arraylist;
import java.util.ArrayList;
import java.util.HashSet;

public class printUniqcNumber {

    public static void main(String[] args) {

        int [] numbers={1,3,5,6,7,7};
       HashSet<Integer> setnumber=new HashSet<>();
        for (int num:numbers){
            System.out.print(num+" " );

        }
        System.out.println();


        System.out.println("****************");
       for( int num2:numbers){
         setnumber.add(num2);
       }
        System.out.println("Not Accept Duplicate Value");
        System.out.println(setnumber);







    }
}
