package Assigment;

public class IfStatement {
    public static void main(String[] args) {
        int fistnmmber =15;
        int secondNumber= 30;
        int thirdNumber= 45;
        int fourthNumber= 70;
        if( fistnmmber> secondNumber|| thirdNumber<fistnmmber||thirdNumber<fistnmmber||fourthNumber<fistnmmber  ){
            System.out.println("15 is bigger");
        } else if (secondNumber> fistnmmber&& secondNumber>thirdNumber|| secondNumber>fourthNumber) {
            System.out.println("30 is bigger");
        }
     else if (thirdNumber> fistnmmber&& thirdNumber>secondNumber&& thirdNumber>fourthNumber) {
        System.out.println("45 is bigger");
    }
     else {
            System.out.println("70 is bigger " +  fistnmmber + " AND "+ secondNumber+"  AND "+ thirdNumber);
        }
    }
}
