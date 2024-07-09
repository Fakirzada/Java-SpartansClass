package Assigment.Test5pmClass.Collections.Arraylist.Set;

import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        // Create a TreeSet of Strings
        TreeSet<String> set = new TreeSet<>();
         set.add("Zkak");
         set.add("Apple");
         set.add("Banana");
        set.add("Orange");
        boolean hasApple = set.contains("Apple"); // Returns true if "Apple" is in the set
        System.out.println(hasApple);
        for (String fruit : set) {
            System.out.println(fruit);
        }

        System.out.println(set.isEmpty());
        System.out.println(set.pollLast());
        System.out.println(set.getFirst());


    }
}
