package week_11.day_3;

public class Reversversion {


    static  String str="hello world";
    public static void main(String[] args) {
       reversversion1();
    }
    public static void  reversversion1(){
        String reverversion="";
         for ( int index=str.length()-1;index>=0;index--){
             reverversion+=str.charAt(index);
         }
        System.out.println(reverversion);

    }

}
