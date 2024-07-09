package week_2.day_1;

import week_2.day_3.VaribaleTest;

import javax.print.DocFlavor;
import java.util.Scanner;

public class CalculateWag {

    public static void main (String [] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Weekly Hours");
        double weeklyHours=scanner.nextDouble();

        System.out.println("Enter Base Salry");
        double baseSalry =scanner.nextDouble();

        System.out.println("Enter Exra Hours");
        double exraHours =scanner.nextDouble();

        System.out.println("Enter Hourly Rate");
        double hourlyRate = scanner.nextDouble();

        System.out.println("Enter Tax Rate");
        double taxRate=scanner.nextDouble();

       // Wage calcualte based on weekly hours and exra hour.
       double wage= calculateWage(weeklyHours,baseSalry,exraHours,hourlyRate);
        // Tax  calculattion Base on wage and exraHour
       double netTax =taxCalculate(wage,taxRate);
       double netPay=wage-netTax;
        System.out.println("Your Next is : "+netPay);
        scanner.close();

    }
    // Wage calcualte based on weekly hours and exra hour.
    public static double calculateWage(
            double weeklyHours,
            double baseSalry,
            double exraHours,
            double hourlyRate
    )
    {
        return (weeklyHours*baseSalry)+(exraHours*hourlyRate);

    }
   // Tax  calculattion Base on wage and exraHour
    public static double taxCalculate(double wage, double taxRate)
    {

        return wage/100*taxRate;
    }



}
