package Assigment.Test5pmClass.ReversedString;

public class ReversedString1 {
    public static void main(String[] args) {
        String original="hello World";
        String reversedversion=reversedWithLoop(original);
        System.out.println(reversedversion);

    }
    public static String reversedWithLoop(String str){

        StringBuilder reversedStr=new StringBuilder();

        for ( int i=str.length()-1;i>=0;i--){
            reversedStr.append(str.charAt(i));

        }
        return reversedStr.toString();
    }

}
