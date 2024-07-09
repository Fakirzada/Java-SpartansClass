package week_12.FindCharaterInString;

public class FindCharatorInString {
    public static void main(String[] args) {
        String str="Hello World";
        char caharater='l';
        int cout=0;
        for ( int i=0;i<str.length();i++){
            if (str.charAt(i)==caharater)cout++;
            }
            System.out.println(cout);
        }
}
