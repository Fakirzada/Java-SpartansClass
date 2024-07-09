package week_2.day_3;

public class VaribaleTest {


    String lastenamel;
    int phone; //Instance Variables
    static  String firtname; //Class Variables:

    public static void main(String[] args) {

        VaribaleTest obje=new VaribaleTest();    /// obj of varilebe
        firtname="saeed";
        obje.phone=100;
        obje.lastenamel="Fakir";

        System.out.println(obje.lastenamel+" "+obje.phone + " "+firtname); //  Instance Variables
        System.out.println(firtname); // clasee level varibale.


    }
}
