package week_2.day_3;

public class TaxReport {

    private TaxCalculate calculator;

    public TaxReport (){

        calculator=new TaxCalculate( 100_000);
    }
    public void show()
        {
          var tax=calculator.calculateTax();

            System.out.println(tax);
        }
}
