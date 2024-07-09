package week_11.Lab;

public class ReverseString {
    private String str="Hllo Word";
    private String reversedVersion;
    //static String[] words=str.split("");

    public static void main(String[] args) {
        print();
    }
    public  String reverseWord() {
       // String str="Hllo Word";
          String [] words=str.split(" ");

        for ( String word : words ) {
            for ( int index = word.length() - 1; index >= 0; index-- ) {
                // Store each character of word to reversedVersion string
                reversedVersion += word.charAt( index );
                // reversedVersion = reversedVersion + word.charAt( index );
            }
            reversedVersion += "";
            //reversedVersion = reversedVersion + " ";
        }
        return reversedVersion;
    }

    public static void print(){
        var obej=new ReverseString();
        System.out.println("Orginal: "+ obej.str );
        System.out.println( "Reversed Version is: " +obej.reverseWord() );

    }



}
