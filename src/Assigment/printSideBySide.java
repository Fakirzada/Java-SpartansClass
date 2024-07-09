package Assigment;

public class printSideBySide {
    public static void main(String[] args) {


        String [] name= {"John"," Wiliams, ","37", " Years Old."};

        System.out.print(name[0]);
       System.out.print(" "+name[1]);
        System.out.print(" "+name[2]);
       System.out.println(" "+name[3]);

        System.out.println("**************");

        for (int index=0;index<name.length;index++){
            System.out.print(name[index]);
        }
        System.out.println();
        System.out.println("**************");
        for (String print:name){

            System.out.print(print);
        }
    }
}
