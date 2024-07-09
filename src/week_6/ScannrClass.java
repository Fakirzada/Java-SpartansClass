package week_6;

import java.util.Scanner;

public class ScannrClass
{

    public static void main(String[] args) {
        Scanner sanner = new Scanner(System.in);
        int id;
        String name;
        String lastname;

        System.out.print("Enter is ID");
         id=sanner.nextInt();
        System.out.print("Enter is Name");
         name=sanner.next();
        System.out.print("Enter is Last Name");
         lastname=sanner.next();
        System.out.println(id+name+lastname);

        
    }
}
