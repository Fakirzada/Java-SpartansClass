package week_12.countWords;

import java.util.Scanner;

public class countWords {
    public static void main(String[] args) {
        Scanner sacnner=new Scanner(System.in);
        System.out.println("Enter a sentance: ");
        String sentance=sacnner.nextLine();
        int count=wordCount(sentance);
        System.out.println("the number of words inn the sentance"+count);
        sacnner.close();
    }

    public static int wordCount(String sentance){
        sentance=sentance.trim();
        if(sentance.isEmpty()){
            return 0;
        }
        String[] words= sentance.split(" ");
        return words.length;

    }
}
