package week_12.ReversedString;

import week_9.llap.StringBuilder;

public class ReversedStringEx {

    public static void main(String[] args) {
        String ORIGINALsTRING="Hello,World";

        String reversedString=reversWithLoop(ORIGINALsTRING);
        System.out.println(reversedString);
    }
    public static String reversWithLoop(String str){
        StringBuffer reveredStr = new StringBuffer();

        for ( int i=str.length()-1;i>=0;i--){
            reveredStr.append( str.charAt(i));
        }

        return reveredStr.toString();
    }

}
