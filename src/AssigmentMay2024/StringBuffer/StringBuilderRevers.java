package AssigmentMay2024.StringBuffer;

import week_11.Lab.StringRevers;

public class StringBuilderRevers {

    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder("Chining");
        builder.append("method").replace(builder.indexOf("method"),
                builder.indexOf("method")+"method".length(),"Operations").reverse();
        System.out.println(builder.toString()+" ");


        String name="Saeed";
StringBuilder bufer=new StringBuilder();
        bufer.replace(0,4,"Khan");
        System.out.println(bufer);
    }
}
