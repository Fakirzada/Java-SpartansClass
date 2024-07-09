package AssigmentMay2024.StringBuffer;

public class StringerBufferForSpace {

    public static void main(String[] args) {
        StringBuilder buffer=new StringBuilder("helloWorld");
        System.out.println("Before: "+buffer);
        buffer.insert(5," ");

        System.out.println("After: "+buffer);

        buffer.replace(5,6,"");
        System.out.println("Removed Space: "+buffer);
    }
}
