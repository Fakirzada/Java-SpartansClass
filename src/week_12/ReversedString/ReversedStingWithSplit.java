package week_12.ReversedString;

public class ReversedStingWithSplit {

    public static void main(String[] args) {
        String original="Hello,World";
        System.out.println(revereWithSplit(original));
    }

 public  static String revereWithSplit( String str){
        String revseed="";
        String[] words=str.split(" ");
        for ( String word:words){
            for ( int i=word.length()-1;i>=0;i--) {
               revseed +=word.charAt(i);

            }
            revseed+=" ";
        }

        return revseed;
    }



}
