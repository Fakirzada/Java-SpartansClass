package AssigmentMay2024.MultilevelInheritance.RetailStoreManagmentSystem;

public class Employee1 {

    /*
    Project 10: Retail Store Management System

Objective: Practice creating a multi-level inheritance structure with additional functionality.

Steps:

    Base Class Creation:
        Create a base class called Employee.
        Define private member variables: name (type String), employeeId (type String), and hourlyWage (type double).
        Provide a constructor to initialize these variables.
        Implement public methods getName(), getEmployeeId(), and getHourlyWage() to access these variables.

    First Level of Inheritance:
        Create a derived class called Cashier that extends Employee.
        Add a private member variable: registerNumber (type int).
        Provide a constructor to initialize all variables, including those in the base class.
        Implement a public method getRegisterNumber() to access the register number.

    Second Level of Inheritance:
        Create a derived class called HeadCashier that extends Cashier.
        Add a private member variable: yearsOfExperience (type int).
        Provide a constructor to initialize all variables, including those in the base class.
        Implement a public method getYearsOfExperience() to access the years of experience.

    Method Implementation:
        In the HeadCashier class, override the getHourlyWage() method to include a raise based on the years of experience.

    Testing:
        In the main method, create a HeadCashier object and display all its details, including those from the Employee and Cashier classes, and the updated hourly wage details.
     */

    private String id;
    private  String name;
    private  double hourlyWage;

    public Employee1(String id, String name, double hourlyWage) {
        setId(id);
       setName(name);
        setHourlyWage(hourlyWage);
    }
    public String getId() {return id;}
    public void setId(String id) {this.id = id;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public double getHourlyWage() {return hourlyWage;}
    public void setHourlyWage(double hourlyWage) {this.hourlyWage = hourlyWage;}
}
