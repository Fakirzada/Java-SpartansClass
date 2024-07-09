package SetofCollection.vector;

import java.util.Vector;

public class vectorExample {

    public static void main(String[] args) {


    Vector<String> vector=new Vector<>();
    vector.add("Khan");
    vector.add(1,"java");
        System.out.println(vector);

    vector.remove(1);
        System.out.println(vector);
        vector.add("jan");


        // Use forEach to iterate and print each element
        vector.forEach(element -> System.out.print(element+" "));

    }
}
