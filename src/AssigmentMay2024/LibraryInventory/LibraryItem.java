package AssigmentMay2024.LibraryInventory;

public class LibraryItem {
    /*
    Project: Library Inventory System

Objective: Enhance a base class with additional data using single inheritance.

Steps:

    1. Create a base class called LibraryItem.
    2. Define private member variables: title (type String) and yearPublished (type int).
    3. Provide a constructor to initialize these variables.
    4. Implement public methods getTitle() and getYearPublished() to access these variables.
    5. Create a derived class called Magazine that extends LibraryItem.
    6. Add a private member variable: issueNumber (type int).
    7. Provide a constructor to initialize all variables.
    8. Implement public method getIssueNumber() to access the issue number.
    9. In a main method, create a Magazine object and display all the details.
     */

    private  String title;
    private  int yearPublished;
//constructor
    public LibraryItem(String title, int yearPublished) {
        this.title = title;
        this.yearPublished = yearPublished;
    }
    //getter
    public   String getTitle(){return title;}
    public  int getYearPublished(){return yearPublished;}

    //setter
    private void setTitle(String title){this.title=title;}
    private void  setYearPublished(int yearPublished){this.yearPublished=yearPublished;}
}
