package Assigment.Test5pmClass.Palindrome_Checker;

public class palndromecheck1 {
    private String str;
    public palndromecheck1(String str) {
        this.str = str;
    }
    public String getStr() {return str;}
    public void setStr(String str) {this.str = str;}

    public static boolean isPalindrome(String str){
         int n=str.length();
         for ( int i=0; i<n/2;i++){
             if ( str.charAt(i)!= str.charAt(n-i-1)){
                 return  false;
             }
         }
       return true;
    }

    public static void main(String[] args) {
        var objPalindrome=new palndromecheck1("madam");
        var objPalindrome1=new palndromecheck1("hello");

        System.out.println(isPalindrome(objPalindrome.str));
        System.out.println(isPalindrome(objPalindrome1.str));
    }
}
