package Arraylist;
import java.util.ArrayList;
public class ArrayListForLoopremoveAndInsert {

    public static void main(String[] args) {

        ArrayList<String> lisrOfname = new ArrayList<>();


        for ( int i=1;i<=50;i++){
            lisrOfname.add("Bob");

        }
        System.out.println(lisrOfname);
        System.out.println(lisrOfname.size());


        // remove  though Arraylist with loop

        for ( int i=1;i<=20;i++){

            lisrOfname.remove("Bob");

        }
        System.out.println(lisrOfname);
        System.out.println(lisrOfname.size());
    }
}
