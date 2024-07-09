package AssigmentMay2024.MultilevelInheritance.SchoolManagementSystem;

public class Person {
    /*
    Project 2: School Management System

Objective: Practice creating a multi-level inheritance structure with additional functionality.
Steps:
    Base Class Creation:
        Create a base class called Person.
        Define private member variables: name (type String) and age (type int).
        Provide a constructor to initialize these variables.
        Implement public methods getName() and getAge() to access these variables.

    First Level of Inheritance:
        Create a derived class called Teacher that extends Person.
        Add a private member variable: subject (type String).
        Provide a constructor to initialize all variables, including those in the base class.
        Implement a public method getSubject() to access the subject.

    Second Level of Inheritance:
        Create a derived class called HeadTeacher that extends Teacher.
        Add a private member variable: yearsOfExperience (type int).
        Provide a constructor to initialize all variables, including those in the base class.
        Implement a public method getYearsOfExperience() to access the years of experience.

    Method Implementation:
        In the HeadTeacher class, override the getSubject() method to provide a detailed description of the subject including experience.

    Testing:
        In the main method, create a HeadTeacher object and display all its details, including those from the Person and Teacher classes, and the updated subject details.
     */

    private String name;
    private int age;

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
}
