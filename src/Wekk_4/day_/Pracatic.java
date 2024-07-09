package Wekk_4.day_;

public class Pracatic {
    public static void main(String[] args) {
        String meaasge= "Hello the world";
        String javaMessange ="Java is easy";

        System.out.println(meaasge.length());

        // this is  method is used for print the location or address (indenx)
        System.out.println(meaasge.charAt(3));
        System.out.println(meaasge.charAt(6));// index 6  it means  location of 6 print it fron memory
        System.out.println(meaasge.charAt(11));
        System.out.println(meaasge.length()-2);
        System.out.println(meaasge.charAt(11));
        System.out.println(meaasge.charAt(meaasge.length()-1));
        System.out.println(meaasge.substring(7));
        System.out.println(meaasge.substring(0,12));
        System.out.println(meaasge.substring(0, meaasge.length()-3));
        System.out.println(meaasge.replace("Hello", "Hello2"));
        meaasge=meaasge.replace("Hello","Jello");
        System.out.println(meaasge);
        System.out.println(javaMessange);

        System.out.println(javaMessange.replaceAll("Java is easy","Java is not easy"));

        String mes1= "Alexander";
        String mes2="Morphy";
        String mes3="Erin Curreto";

        System.out.println(mes1.replace("Alexander", "Erin"));
        System.out.println(mes2.replace("Morphy","Curreto"));
        System.out.println(mes3.replaceAll("Erin Curreto","Khan Jan"));
        System.out.println(mes3.replaceAll(" ",""));  //  remove the sapce
        System.out.println(mes1.length());

        mes1=mes1.toLowerCase();
        System.out.println(mes1);

        mes1=mes1.toUpperCase();
        System.out.println(mes1);

        String mes4= "     Hello     ";
        System.out.println(mes4);

        System.out.println(mes4.trim());





    }
}
