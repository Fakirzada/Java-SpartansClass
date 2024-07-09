package AssigmentMay2024.MultilevelInheritance.RetailStoreManagmentSystem;

public class Cashier extends Employee1 {

    private  int registerNumber;

    public Cashier(String id, String name, double hourlyWage, int registerNumber) {
        super(id, name, hourlyWage);
       setRegisterNumber(registerNumber);
    }

    public int getRegisterNumber() {return registerNumber;}
    public void setRegisterNumber(int registerNumber) {this.registerNumber = registerNumber;}




}
