package SetofCollection;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        int [] numbers={1,2,4,6,3,7,33,88};
        TreeSet<Integer> tReeSetNumber=new TreeSet<>();

        for ( int number:numbers ){
            tReeSetNumber.add(number);
        }
        System.out.println(tReeSetNumber);


        System.out.println("*********************");

        //  String

        String[]names={"Khan","jan","Ali","Khan","Ali"};
        TreeSet<String> tReeSetName=new TreeSet<>();
        for ( String name:names ){
            tReeSetName.add(name);
        }
        System.out.println(tReeSetName);
    }
}
