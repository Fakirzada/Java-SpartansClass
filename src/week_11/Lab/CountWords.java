package week_11.Lab;

public class CountWords {
    public static void main(String[] args) {

        String str="Welcome To Welcome to welcome";
        String[] words=str.split(" ");

        String[] ww= new String[]{str};

        int coutwelcome=0;

        for ( String word: words){
            //System.out.println(word.length());
            if (word.equals("Welcome")) coutwelcome++;
            System.out.println(word);

        }

        for ( String print : ww){
            System.out.println(print);
        }
        System.out.println(ww.length);

    }
}
