package week_12.ReversedString;

public class ReversedStringSample {

    public static void main(String[] args) {
        String originalString="Hello,Wolrd";
        String reversed="";

        for ( int i =originalString.length()-1;i>=0;i--){
            reversed+=originalString.charAt(i);
        }
        System.out.println(reversed);
    }
}
