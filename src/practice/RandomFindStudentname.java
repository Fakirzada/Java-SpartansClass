package practice;

import java.util.Random;

public class RandomFindStudentname {

    public static void main(String[] args) throws InterruptedException {

        String[] names={"Saeed","Ali","Ahmad","Ali","Jan","Eric"};
        Random random=new Random();
        int randomIndexByComputer=random.nextInt(names.length);

        System.out.println("Student Name will be reveal in:  ");
        for (int timer=5;timer>=1;timer--){
            System.out.println("Ready in! :" +timer);
            Thread.sleep(1000);
        }
        System.out.println(names[randomIndexByComputer]);
    }

}
