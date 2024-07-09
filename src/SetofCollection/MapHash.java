package SetofCollection;

import java.util.HashMap;
import java.util.Map;

public class MapHash {

    public static void main(String[] args) {
        HashMap<Integer,String> mymap=new HashMap<>();

        mymap.put(1,"Mathis");
        mymap.put(2,"Ali");
        mymap.put(3,"Khan");


        System.out.println("************************");
       // Retrave the data by for loop
        for (Map.Entry<Integer, String> entry : mymap.entrySet())
        { System.out.println("Key: => " + entry.getKey() + ", Value: " + entry.getValue()); }


        System.out.println("************************");

        for (int entry : mymap.keySet()){
            System.out.println(entry);
        }
        System.out.println("************************");


        for( String entery:mymap.values()){
            System.out.print(entery+" ");
        }
        System.out.println();
        System.out.println("************************");

        mymap.put(30,"Saeed");
        System.out.println(mymap);


        System.out.println(mymap .containsKey(30));
        System.out.println(mymap.containsValue("Saeed"));
        System.out.println(mymap.get(30));

        System.out.println(mymap.remove(1));
        System.out.println(mymap);
        mymap.clear();
        System.out.println(mymap);
        mymap.put(1,"Mathise");
        System.out.println(mymap);

        System.out.println(mymap);
        mymap.put(2,"Khan");
        System.out.println(mymap.entrySet());







    }
}
