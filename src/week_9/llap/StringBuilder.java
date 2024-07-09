package week_9.llap;

public class StringBuilder {



    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb);  // Output: Hello World

        sb.insert(5, ", Khan");
        System.out.println(sb);  // Output: Hello, World
        System.out.println(sb.length());
        sb.replace(5, 6, ";");
        System.out.println(sb);  // Output: Hello; World

        sb.delete(5,6);
        System.out.println(sb);  // Output: Hello World

        sb.reverse();
        System.out.println(sb);  // Output: dlroW olleH

        sb.delete(0,17);
        System.out.println(sb);

        //String Builder

        for (int i = 0; i < 20; i++) {

            System.out.print("*");
        }
    }


}
