

package Arraylist;
import java.util.ArrayList;
import java.util.List;
public class ArrrayList {

    public static void main(String[] args) {

        // Using the List interface as the type
        List<String> fruits = new ArrayList<>();

// Or directly with ArrayList
        ArrayList<String> lisrOfname = new ArrayList<>();

        lisrOfname.add("Saeed");
        lisrOfname.add("Ali");

        System.out.println(lisrOfname);
        lisrOfname.add(1,"Khan");

        for ( String name: lisrOfname){
            System.out.println(name);
        }

        System.out.println(lisrOfname.getFirst());
        System.out.println(lisrOfname.getLast());
        System.out.println(lisrOfname.get(1));

        lisrOfname.remove(1);
        System.out.print("*********************");
        System.out.println(" ");
        for ( String name: lisrOfname){
            System.out.println(name);
        }

        /// Arrayslist of boolean

        ArrayList<Boolean> booleanList=new ArrayList<>();
        List<Integer> intList=new ArrayList<>();

        for (int i=1;i<=6;i++){
            booleanList.add(true);
            System.out.println(booleanList);
        }

        intList.add(134);
        intList.add(123);

        System.out.println(intList);
        System.out.println(lisrOfname);
        lisrOfname.add(2,"Erik");

        System.out.println(lisrOfname);
         lisrOfname.remove(2);
        System.out.println(lisrOfname);
        lisrOfname.reversed();
        lisrOfname.reversed().get(0);
        lisrOfname.get(0);
        lisrOfname.remove(1);
        System.out.println(lisrOfname);

        System.out.println(lisrOfname.get(0).replaceAll("Saeed","khan"));

        lisrOfname.clear();
        System.out.println(lisrOfname);


    }
}
