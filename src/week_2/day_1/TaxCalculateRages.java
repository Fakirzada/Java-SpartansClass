package week_2.day_1;

public class TaxCalculateRages {
    public static void main(String[] args)
    {
        double wage = 2550;

        if ( wage >= 500 && wage <= 1000)
        {
            double tex= wage-(wage/100*10);
            System.out.println(tex);
        } else if (wage >=0 && wage< 500) {

            System.out.println(wage);

        }
        else if (wage >= 1001 && wage <= 2500)
        {
            double tex=wage-(wage/100*15);
            System.out.println(tex);
        }

        else {

            double highTax=wage-(wage/100*25);
            System.out.println(highTax);
        }


    }
}
