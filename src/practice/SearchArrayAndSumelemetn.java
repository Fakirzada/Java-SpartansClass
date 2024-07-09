package practice;

import java.util.Scanner;

public class SearchArrayAndSumelemetn {
    public static void main(String[] args) {

        var scanObj=new Scanner(System.in);
        int countDoublicate=0;

        String[] name={"Ali","Jan","Khan","Eric","Ali"};
        for(String print:name){System.out.println(print);}

        System.out.println("Enter The You want to count it ");
        String searchName=scanObj.next();

        for (int indeax=0; indeax<name.length;indeax++){
             if(name[indeax].equals(searchName)) countDoublicate++;
        }
        for(int i=0; i<50;i++){System.out.print("*");}
        System.out.println();
        System.out.println("We Found Name OF "+searchName+" is Repited: " +countDoublicate +" Times");
    }
}
