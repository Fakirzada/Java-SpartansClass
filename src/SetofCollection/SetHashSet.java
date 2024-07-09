package SetofCollection;

import java.util.HashSet;

public class SetHashSet {

    public static void main(String[] args) {
        HashSet<String> setOfnames=new HashSet<>();
//   could not accept suplicate vlaue
        setOfnames.add("Ali");
        setOfnames.add("Khan");
       setOfnames.add("Bab");


// Not gratten to print value based on other

        System.out.println(setOfnames.add("Ali"));
        System.out.println(setOfnames.add(null));
        System.out.println(setOfnames.isEmpty());
        System.out.println(setOfnames.add("Jan"));
        System.out.println(setOfnames);


        //we cant remove the value based on the index becuase of Hash table;

        setOfnames.remove("Ali");
        System.out.println(setOfnames);
        System.out.println(setOfnames.size());

        String[] name={"Khan","HH","M","HHH"};

        for (String fiil:name){
            setOfnames.add(fiil);
        }
        System.out.println(setOfnames);

    }
}
