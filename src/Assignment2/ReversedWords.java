package Assignment2;

public class ReversedWords {
   static String str="Hello Wolrd";
    static String reversedVersion;

    public static void main(String[] args) {
        var objct=new ReversedWords();
        objct.printReversedVersion();
    }

    // Methods
    private String reverseWord() {
        String[] words=str.split(" ");
        for ( String word : words ) {
            for ( int index = word.length() - 1; index >= 0; index-- ) {
                // Store each character of word to reversedVersion string
                reversedVersion += word.charAt( index );
                // reversedVersion = reversedVersion + word.charAt( index );
            }
            reversedVersion += " ";
            // reversedVersion = reversedVersion + " ";
        }
        return reversedVersion;
    }

    // public Methods
    public  void printReversedVersion() {
       // System.out.println("original String: " + getStr());
        System.out.println("Original Words: "+ str);
       System.out.println( "Reversed Version is: " + reverseWord() );;
       System.out.println(reversedVersion);
    }
}
