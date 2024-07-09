package week_7;

import com.sun.jdi.PathSearchingVirtualMachine;

public class ARRAY {
    public static void main(String[] args) {


        String [] name ={"saeed","Ali"};

        name [1]="Khan";

        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[0]+name[1]);

        System.out.println(name[1].replace("Khan", "Jana"));


        int [][] jan =new int [1][2];
    }
}
