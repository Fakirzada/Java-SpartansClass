package week_12.FindCharaterInString;

public class CountWords {

    public static void main(String[] args) {
        String str = "Hello World";
        String worSerch = "World";
        int wordcount = 0;
        for (String word : str.split(" ")) {
            if (word.equals(worSerch)) {
                wordcount++;
            }
        }
        System.out.println(wordcount);
    }
}