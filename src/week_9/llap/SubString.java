package week_9.llap;

public class SubString {
    public static void main(String[] args) {
        String str ="hello, World";
        System.out.println(str);
        String substr=str.substring(7);
        String subString1=str.substring(4,6);
        System.out.println(subString1);
        System.out.println(substr);
        System.out.println(str.indexOf("d"));
        System.out.println(str.indexOf("h"));
        System.out.println(str.length()-1);
        System.out.println(str.length());
        // used StringBuffer to reverse the words


        StringBuffer sbf=new StringBuffer(str);
        sbf.reverse();
        System.out.println(sbf);

    }
}
