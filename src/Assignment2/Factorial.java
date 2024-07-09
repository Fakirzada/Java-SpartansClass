package Assignment2;

public class Factorial {

    public static void main(String[] args) {
        int factorial=1;
        int  n=5;
        for ( int i=1; i<=5;i++){
            factorial*=i;
        }
        System.out.println("The factorial of " + n + " is: " + factorial);

        System.out.println("********************************");
        System.out.println("example, the program calculates the factorial of 5!=5×4×3×2×1=120.");
    }
}
