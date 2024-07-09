package AssigmentMay2024.MultilevelInheritance.EmployeeManagmentSystem;

public class seniorManager extends Manager {

    private int yearsofExperinces;
    public seniorManager(String id, String name, double salary, String deparment, int yearsofExperinces) {
        super(id, name, salary, deparment);
        this.yearsofExperinces = yearsofExperinces;
    }
    public int getYearsofExperinces() {return yearsofExperinces;}
    public void setYearsofExperinces(int yearsofExperinces) {this.yearsofExperinces = yearsofExperinces;}

    public double bonusmethod(){
        double bonus=(getSalary()/100*10*yearsofExperinces);
        double sarayBonus=getSalary()+bonus;
        return sarayBonus;
    }
    public  void printinfo(){
        System.out.println(getId());
        System.out.println(getName());
        System.out.println(getDeparment());
        System.out.println(getYearsofExperinces());
        System.out.println(bonusmethod());

    }
}
