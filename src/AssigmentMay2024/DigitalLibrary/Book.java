package AssigmentMay2024.DigitalLibrary;

public class Book {
/*
    Objective: Practice inheritance with additional attributes.
            Steps:
            1. Create a base class called Book.
            2. Define private member variables: title (type String) and author (type String).
            3. Provide a constructor to initialize these variables.
    4. Implement public methods getTitle() and getAuthor() to access these variables.
            5. Create a derived class called EBook that extends Book.
            6. Add a private member variable: fileSize (type double).
            7. Provide a constructor to initialize all variables.
    8. Implement public method getFileSize() to access the file size.
            9. In a main method, create an EBook object and display all the details.
    /*
 */
    private  String  title;
    private String  author ;
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public String getTitle() {return title;}
    public String getAuthor() {return author;}
    public void setTitle(String title) {this.title = title;}
    public void setAuthor(String author) {this.author = author;}
}
