package AssigmentMay2024.MultilevelInheritance.EmployeeManagmentSystem;

public class Employee {
    /*
    Project 1: Employee Management System

Objective: Practice creating a multi-level inheritance structure with additional functionality.

Steps:

    Base Class Creation:
        Create a base class called Employee.
        Define private member variables: name (type String), employeeId (type String), and salary (type double).
        Provide a constructor to initialize these variables.
        Implement public methods getName(), getEmployeeId(), and getSalary() to access these variables.

    First Level of Inheritance:
        Create a derived class called Manager that extends Employee.
        Add a private member variable: department (type String).
        Provide a constructor to initialize all variables, including those in the base class.
        Implement a public method getDepartment() to access the department.

    Second Level of Inheritance:
        Create a derived class called SeniorManager that extends Manager.
        Add a private member variable: yearsOfExperience (type int).
        Provide a constructor to initialize all variables, including those in the base class.
        Implement a public method getYearsOfExperience() to access the years of experience.

    Method Implementation:
        In the SeniorManager class, override the getSalary() method to provide a higher salary by adding a bonus based on the years of experience.
        Provide a logic where the bonus is calculated as 10% of the salary for each year of experience.
        Implement the getSalary() method to return the updated salary.

    Testing:
        In the main method, create a SeniorManager object and display all its details, including those from the Employee and Manager classes, and the updated salary details.
     */

    private String id;
    private String name;
    private double salary;

    public Employee(String id, String name, double salary) {
        setId(id);
       setName(name);
       setSalary(salary);
    }

    public String getId() {return id;}
    private void setId(String id) {this.id = id;}
    public String getName() {return name;}
    private void setName(String name) {this.name = name;}
    public double getSalary() {return salary;}
    private void setSalary(double salary) {this.salary = salary;}
}
