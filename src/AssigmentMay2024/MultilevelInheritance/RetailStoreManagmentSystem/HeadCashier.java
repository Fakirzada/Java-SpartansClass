package AssigmentMay2024.MultilevelInheritance.RetailStoreManagmentSystem;

public class HeadCashier extends Cashier {

    private int yearsOfExperience;

    public HeadCashier(String id, String name, double hourlyWage, int registerNumber, int yearsOfExperience) {
        super(id, name, hourlyWage, registerNumber);
        setYearsOfExperience(yearsOfExperience);
    }

    public int getYearsOfExperience() {return yearsOfExperience;}
    public void setYearsOfExperience(int yearsOfExperience) {this.yearsOfExperience = yearsOfExperience;}

    public double raiseWageBasedOnYear(){

        double riseWage=getHourlyWage()/100*10*yearsOfExperience;
        double netWageRise=getHourlyWage()+riseWage;
   return netWageRise;
    }


    public  void printinfo(){
        System.out.println("ID: "+getId());
        System.out.println("Name: "+getName());
        System.out.println("RegisterNumber: "+getRegisterNumber());
        System.out.println("Experience: "+getYearsOfExperience());
        System.out.println("Based Wage: "+getHourlyWage());
        System.out.println("10% raise based on one years of experience: "+raiseWageBasedOnYear());
    }
}
