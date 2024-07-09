package week_11.day_1;

public class Students extends Employee{
    int studetnID;
    String graduationDate;
    String  subject;
    char gender;
    public Students(String firstname, String lastName, int DOB, int studetnID, String graduationDtae, String subject, char gender) {
        super(firstname, lastName, DOB);   // come from parent class Employee
        this.studetnID = studetnID;
        this.graduationDate = graduationDtae;
        this.subject = subject;
        this.gender = gender;
    }
    void printStudentInfo(){
    System.out.println("StudentID: "+studetnID);
        System.out.println("First name: "+getFirstname());
        System.out.println("Laste: "+getLastName());
        System.out.println("DOB: "+getDOB());
        System.out.println("Graduation Date:"+graduationDate);
        System.out.println("Subject: "+subject);
        System.out.println("gender: "+gender);
}
}
