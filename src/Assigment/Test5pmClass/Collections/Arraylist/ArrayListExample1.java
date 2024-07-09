package Assigment.Test5pmClass.Collections.Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample1 {
    public static void main(String[] args) {
        /*

In Java, an ArrayList is a resizable array implementation of the List interface.
It is part of the java.util package and provides a dynamic array for storing elements.
Unlike arrays, ArrayList can grow and shrink in size automatically when elements are added or removed.
This makes it a flexible and convenient data structure for handling lists of objects.

Key Features of ArrayList
Dynamic Size: Automatically resizes as elements are added or removed.
Indexed Access: Elements can be accessed directly by their index.
Generic: Can store any type of objects, including custom objects, using Java Generics.
Ordered: Maintains the order of elements as they are inserted.
         */

        ArrayList<String> listOfname=new ArrayList<>();

        var sacnner =new Scanner(System.in);
        System.out.println("Enter Number Of ArrayLists");

        int numberOfElements=sacnner.nextInt();

        for(int i =0;i<numberOfElements;i++){
            System.out.print("Enter element " + (i + 1) + ": ");
            String element=sacnner.next();
            listOfname.add(element);
        }

        System.out.println(listOfname);


    }
}
