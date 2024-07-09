package Arraylist;
import java.util.LinkedList;
import java.util.List;
public class ArrayToArraylist {

    public static void main(String[] args) {
        String[] name={"Ali","Khan","jan"};

        LinkedList<String> listname=new LinkedList<>();

        for ( int i=0;i<name.length;i++){
            listname.add(name[i]);
        }

        System.out.println(listname);


        System.out.println("**************************");

        /// add vale from Array to Arraylist
        for( String puntname: name){
            listname.add(puntname);
            System.out.println(puntname);
        }


        ///  Remove Arraylist vale

        listname.clear();
        System.out.println(listname);

    }



}
