package week_11.day_1;
public class Employee {
    private String firstname;
    private String lastName;
    private int DOB;
    private double salary;
    public Employee( String firstname, String lastName,int DOB){setFirstname(firstname);setLastName(lastName);setDOB(DOB);}
    public String getFirstname() {return firstname;}
    public String getLastName() {return lastName;}
    public int getDOB() {return DOB;}
    private double getSalary() {return salary;}
    public void setFirstname(String firstname) {this.firstname = firstname;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setDOB(int DOB) {this.DOB = DOB;}
    private void setSalary(double salary) {this.salary = salary;
    }
    private void printEmplyeeinfo(){
        System.out.println("First name: "+firstname);
        System.out.println("Laste: "+lastName);
        System.out.println("DOB: "+DOB);
        System.out.println("Salary"+salary);
    }

}
