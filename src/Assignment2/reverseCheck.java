package Assignment2;

public class reverseCheck {
    public static void main(String[] args) {

        String str="dad";
        String str1="orange";

        System.out.println(pulaniger(str));
        System.out.println(pulaniger(str1));
    }

    public static boolean pulaniger(String str){
        String reverse="";

        for ( int i=str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);
        }

        return str.equals(reverse);

    }
}
