package AssigmentMay2024.HierarchicalInheritance;

public class Animal {
    /*
    Project 1: Animal Kingdom

Objective: Practice creating a hierarchical inheritance structure with shared base class functionality.

Steps:

    Base Class Creation:
        Create a base class called Animal.
        Define private member variables: name (type String) and age (type int).
        Provide a constructor to initialize these variables.
        Implement public methods getName() and getAge() to access these variables.

    First Derived Class:
        Create a derived class called Mammal that extends Animal.
        Add a private member variable: isDomestic (type boolean).
        Provide a constructor to initialize all variables, including those in the base class.
        Implement a public method getIsDomestic() to access the isDomestic variable.

    Second Derived Class:
        Create a derived class called Bird that extends Animal.
        Add a private member variable: canFly (type boolean).
        Provide a constructor to initialize all variables, including those in the base class.
        Implement a public method getCanFly() to access the canFly variable.

    Third Derived Class:
        Create a derived class called Fish that extends Animal.
        Add a private member variable: isSaltWater (type boolean).
        Provide a constructor to initialize all variables, including those in the base class.
        Implement a public method getIsSaltWater() to access the isSaltWater variable.

    Testing:
        In the main method, create objects of Mammal, Bird, and Fish and display all their details, including those from the Animal class.
     */

    private String name;
    private  int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
}
