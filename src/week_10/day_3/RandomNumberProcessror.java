package week_10.day_3;

import java.util.Random;



public class RandomNumberProcessror {


    private  int [] genertaRandomNumber(int size) {
        var random = new Random();
        int[] numbers = new int[size];
        for ( int i=0;i<size;i++){

            numbers[i]=random.nextInt(100);
        }
        return numbers;
    }

}
