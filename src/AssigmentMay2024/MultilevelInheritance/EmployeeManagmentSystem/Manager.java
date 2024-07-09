package AssigmentMay2024.MultilevelInheritance.EmployeeManagmentSystem;

public class Manager extends Employee {
    private String deparment;
    public Manager(String id, String name, double salary, String deparment) {
        super(id, name, salary);
        this.deparment = deparment;
    }
    public String getDeparment() {return deparment;}
    public void setDeparment(String deparment) {this.deparment = deparment;}
}
