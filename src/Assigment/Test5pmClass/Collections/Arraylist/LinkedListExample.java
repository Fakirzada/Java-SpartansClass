package Assigment.Test5pmClass.Collections.Arraylist;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListExample {
    public static void main(String[] args) {
        /*

In Java, LinkedList is a part of the java.util package and implements both the List and Deque interfaces,
 making it a versatile data structure. It provides a doubly-linked list implementation,
  where each element is stored in a node, and each node contains references to the next and previous nodes.

Key Features of LinkedList
Dynamic Size: Automatically resizes as elements are added or removed.
Double-Ended Queue: Implements both List and Deque interfaces, supporting operations at both ends of the list.
Element Insertion/Removal: Efficient for insertions and removals compared to ArrayList, especially when dealing with large amounts of data.
Indexed Access: Supports indexed access, though it is less efficient compared to ArrayList.
         */

        var linkedlistNmae=new LinkedList<String>();
        var sacanner =new Scanner(System.in);
        System.out.println("Enter Numbers of Element");
        int numberOfElement=sacanner.nextInt();

        for ( int i=0;i<numberOfElement;i++){
            System.out.println("Enter elements:"+ (i+1)+": ");
            String element=sacanner.next();
            linkedlistNmae.add(element);
        }

        System.out.println(linkedlistNmae);

        for ( String  pritnLinkedList: linkedlistNmae){
            System.out.println(pritnLinkedList);
        }


        linkedlistNmae.remove(1);
        System.out.println(linkedlistNmae);

        linkedlistNmae.clear();
        System.out.println(linkedlistNmae);



    }
}
