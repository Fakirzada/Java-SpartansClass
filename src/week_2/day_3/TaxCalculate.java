package week_2.day_3;

public class TaxCalculate {




    private double taxableIncome;

    public static void main(String[]args)
    {


    }

    public TaxCalculate(double taxableIncome)
    {
        this.taxableIncome=taxableIncome;
    }

    public double calculateTax(){

        return taxableIncome*0.3;
    }

}
