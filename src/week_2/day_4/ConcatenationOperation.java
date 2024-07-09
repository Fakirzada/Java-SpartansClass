package week_2.day_4;

import week_2.day_3.VaribaleTest;

public record ConcatenationOperation() {

    public static void main(String[] args) {



        int num1= 10;
        int num2= 20;
        int result= num1+num2;

        System.out.println("Result : "+result);// this is operation or logical it is meas performce mathematial opertion on it.
        System.out.println("Result :"+num1+num2); // this is concatenation it means combing onw or tow String
        System.out.println(10+20);

        System.out.println(150+10 +" "+ "Erik"+" "+"Jan"+" "+50);

        //Subestraction  operation

        result=result-10;
        System.out.println(result);
        result=result-15;
        System.out.println(result);



    }


}
