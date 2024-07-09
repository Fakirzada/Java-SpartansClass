package week_8.loob;

public class dowhule3 {

    public static void main(String[] args) {
         String name= "Ahamd";
         int i=1;
         do{
             System.out.println(i+ "."+name);
           i++;
         } while ( i <= 5);

        System.out.println("**** Do While loop with zero condition ***");
         // First excute then check the condition

         do {
             System.out.println(name);
         } while (i<0);

//   While loop

        System.out.println("**** While loop ***");
          int j=1;
          while (j<4){

              System.out.println(j+"."+name);
              j++;
          }


        int n = 10; // You can change this value to any positive integer
        int sum = 0;
        int k = 1;

        do {
            sum += k;
            k++;
        } while (k <= n);

        System.out.println("Sum of numbers from 1 to " + n + " is: " + sum);
    }

}
