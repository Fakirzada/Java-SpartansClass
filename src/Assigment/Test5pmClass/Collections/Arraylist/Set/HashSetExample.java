package Assigment.Test5pmClass.Collections.Arraylist.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        /*

In Java, a HashSet is part of the java.util package and implements the Set interface.
It uses a hash table for storage, which means that it does not maintain the order of elements.
 HashSet is designed for fast lookup, insertion, and deletion operations.

Key Features of HashSet
No Duplicates: HashSet does not allow duplicate elements.
Null Elements: Allows one null element.
Unordered: Does not maintain any order of the elements.
Fast Operations: Provides constant-time performance for basic operations like add, remove, contains, and size.
         */

        Set<String> listhasName=new HashSet<>();
        listhasName.add("Jan");
        listhasName.add("eric");
        System.out.println(listhasName);
        listhasName.add("Ali");
        listhasName.add("kk");
        System.out.println(listhasName);

        HashSet<Integer> numbberSet=new HashSet<>();
        numbberSet.add(1200);
        numbberSet.add(340);
        numbberSet.add(4500);
        System.out.println(numbberSet);


      //Arraylist unique Number;
/*
       int [] numbers={1,3,5,76,8,88,88,12,3,4,4,5,6};

        ArrayList<Integer> uniqueNumbers=new ArrayList<>();

        // print value unique

        for ( int i=0;i<numbers.length;i++){
             boolean isUnique;
             for (int j=0;j<i;j++){
                 isUnique=true;
                 if (numbers[j]==numbers[i]){
                     isUnique=false;
                     break;
                 }
                 if(isUnique){
                     uniqueNumbers.add(numbers[i]);
                 }
             }
            System.out.println();
        }
        System.out.println(uniqueNumbers);

*/
        int[] numbers = { 10, 15, 10, 1, 3, 5, 4, 0, 1, 1, 1, 0, 10 };
        ArrayList<Integer> uniqueNumbers = new ArrayList<>();

        // Print the unique values
        for ( int i = 0; i < numbers.length; i++ ) {
            boolean isUnique;
            for ( int j = 0; j < i; j++ ) {
                isUnique = true;
                if ( numbers[j] == numbers[i] ) {
                    isUnique = false;
                    break;
                }
                if ( isUnique ) {
                    uniqueNumbers.add(numbers[i]);
                }
            }
            System.out.println();
        }
        System.out.println( uniqueNumbers );
    }



}
