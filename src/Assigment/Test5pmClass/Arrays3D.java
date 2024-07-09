package Assigment.Test5pmClass;

import java.util.Random;
import java.util.Scanner;

public class Arrays3D {

    public static void main(String[] args) {
        var sacnner =new Scanner(System.in);

        System.out.println("Enter row size of arrays ");
         int sizerow=sacnner.nextInt();
        System.out.println("Enter Col size of arrays ");
         int sizeCol=sacnner.nextInt();
        int [][] number=new int[sizerow][sizeCol];

        Random random=new Random();
        int randomnumber;
        int rowNumner=0;
        int colnumber=0;

        for ( int row=0;row<number.length;row++){
            for ( int clo=0;clo<number[row].length;clo++){
                randomnumber=random.nextInt((9-1)-1)+1;
                number[row][clo]=randomnumber;
            }
        }

        for ( int k=0;k<number.length;k++ ) {
            System.err.print("   "+ colnumber+ " index:");
            colnumber++;
            System.out.print(" ");
        }

        for ( int i=0; i<number.length;i++){
                System.out.println();
                System.out.print(rowNumner+"-");
                rowNumner++;
                for (int j = 0; j < number[i].length; j++) {
                    System.out.print(" [  " + number[i][j] + "  ] , ");
                }
        }
        System.out.println();
        System.out.println("Enter your number to compare with tage arrays");
        int inputnumer= sacnner.nextInt();
        System.out.println("Row Target ");
        int rowtraget=sacnner.nextInt();
        System.out.println("Col Target ");
        int coltrage=sacnner.nextInt();
        boolean reslut=inputnumer==number[rowtraget][coltrage];
        System.err.println("Result of User Input is: "+reslut);
    }
}
