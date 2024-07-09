package Arraylist;
import java.util.LinkedList;
import java.util.List;
public class LinkList {

    public static void main(String[] args) {
        // Create a LinkedList of Strings
        List<String> fruits = new LinkedList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        // new value in the new element or index
        fruits.add(3,"Watermelon");
        // Accessing elements
        System.out.println("First fruit: " + fruits.get(0));
        System.out.println(fruits);
        fruits.remove(1);
        System.out.println(fruits);

        // Removing elements
        fruits.remove("Banana"); // By value
        fruits.remove(1); // By index

        // Iterating through the LinkedList
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Checking if an element exists
        if (fruits.contains("Apple")) {
            System.out.println("Apple is in the list.");
        }

        // Getting the size of the LinkedList
        System.out.println("Size of the list: " + fruits.size());

        // Clearing the LinkedList
        fruits.clear();
        System.out.println(fruits);
        System.out.println("Size after clearing: " + fruits.size());


        System.out.println("+++++++++++++++********************");
        LinkedList<Integer> listOfNumber=new LinkedList<>();
        listOfNumber.add(2001);
        listOfNumber.add(3500);
        listOfNumber.add(540);

        System.out.println(listOfNumber);



    }
}
