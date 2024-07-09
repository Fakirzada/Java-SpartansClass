package Assigment.Test5pmClass;

import java.util.Random;

public class RandomString {
    public static void main(String[] args) throws InterruptedException {
        String [] name={"SAEED","BENAFSHA","SARA","JUNAID","RAYHAN"};
        String randomName=generatName(name);
        System.out.println(randomName);
    }
public static String generatName(String [] name) throws InterruptedException {
    Random random=new Random();
    int randomInt;
    randomInt=random.nextInt( name.length);
    for ( int i=5;i>=1;i--){
        Thread.sleep(1000);
        System.out.println(i);
    }
 return name[randomInt];
}
}
