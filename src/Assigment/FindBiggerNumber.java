package Assigment;

public class FindBiggerNumber {

    public static void main(String[] args) {

        int firstNumber= 35;
        double secondNumbr= 20.5;
        int thirdNumber= 15;
        int forthNumber= 10;

        double result= secondNumbr+thirdNumber;
        //System.out.println(result);

        if ( firstNumber<secondNumbr){

            System.out.println("The FirstNumber Bigger");

        } else if (result<firstNumber) {

            System.out.println("The Second Number + thirdNumber bigger");
        }
        else {
            System.out.println("The Firt number Samllar");
        }

    }

}
