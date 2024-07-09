package week_2.day_1;

import java.util.Scanner;

public class SalrCalWeekly {



    public static void main(String[] args)
    {

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter weely hours");
        double weeklyHour=scanner.nextDouble();
        //int weeklyHour=40;

        System.out.println("Enter Base salry");
        double baseSarlyRate=scanner.nextDouble();
        //double baseSarlyRate= 16;0

        System.out.println("Enter Exra Hours");
        double exraHours=scanner.nextDouble();
       // double exraHours =8;

        System.out.println("Enter Hourly Rate");
        double hourlyrate=scanner.nextDouble();

        System.out.println("Enter tax Rate");
        double tax=scanner.nextInt();

        double wage=(weeklyHour*baseSarlyRate)+(exraHours*hourlyrate);
        double finalTax=taxCalculation(tax,wage);
        double netTo=wage-finalTax;


        System.out.println(netTo);
        scanner.close();

       double x= 640;
        double y= 192;
        double z =x+y;
        double tz = z /100*15;
       double netTotal=z-tz;

       System.out.println(netTotal);
    }

    public  static  double taxCalculation (double tax, double wage){

        return tax=wage/100*tax;
    }
}
