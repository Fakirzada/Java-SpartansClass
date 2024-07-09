package Assigment.Test5pmClass.Collections.Arraylist.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashsetLinkedExample {

    public static void main(String[] args) {
        /*

In Java, LinkedHashSet is a part of the java.util package and is an implementation of the Set interface.
 It extends HashSet and maintains a doubly-linked list across all elements.
 This means that it combines the unique element properties of a HashSet with the predictable iteration order of a LinkedList.

Key Features of LinkedHashSet
No Duplicates: Like all sets, LinkedHashSet does not allow duplicate elements.
Order of Insertion: Maintains the order in which elements were inserted.
Null Elements: Allows one null element.
Fast Operations: Provides constant-time performance for basic operations like add, remove, contains, and size.

         */
        LinkedHashSet<String> set=new LinkedHashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");


        boolean hasApple = set.contains("Apple");
        System.out.println(hasApple);

        set.remove("Banana"); // Removes the element "Banana" from the set
        // Using a for-each loop
        for (String fruit : set) {
            System.out.println(fruit);
        }
        System.out.println("************************");
// Using an iterator
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
