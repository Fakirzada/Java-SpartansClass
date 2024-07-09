package week_10.day_2;
import java.util.Random;
import java.util.Scanner;
public class pratice {
    public static void main(String[] args) {
        var scanner=new Scanner(System.in);
        System.out.println("Enter you Array Size");
       int n=scanner.nextInt();
       int [] array=new int[n];

        Random random=new Random();
        for ( int i =0;i<n;i++){
           // array[i]=scanner.nextInt();
            System.out.println();
           //System.out.println(array[i]);
       }
        for (int i=0;i<n;i++){
            if(i%2!=0){
                System.out.println(array[i]=random.nextInt(n));
            }
        }


    }

}
