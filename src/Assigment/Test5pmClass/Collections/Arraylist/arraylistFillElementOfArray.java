package Assigment.Test5pmClass.Collections.Arraylist;

import java.util.ArrayList;

public class arraylistFillElementOfArray {

    public static void main(String[] args) {
        String [] name={"Khan","Eric","Jan"};
        ArrayList<String> listname=new ArrayList<>();

        for ( String anm:name){
            listname.add(anm);
        }
        System.out.println(listname);

        System.out.println(listname.size());
        System.out.println(listname.hashCode());

    }
}
