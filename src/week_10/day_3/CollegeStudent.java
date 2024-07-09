package week_10.day_3;

public class CollegeStudent extends UserInfo {

        // Variables
        double gpa;
        String diploma;
        String[] courses;

    public CollegeStudent(int id, String firstName, String lastName, int age, String dateOfBirth, String occupation) {
        super(id, firstName, lastName, age, dateOfBirth, occupation);
    }

    public double getGpa() {return gpa;}

    public String getDiploma() {return diploma;}
    public String[] getCourses() {return courses;}

    public void setGpa(double gpa) {this.gpa = gpa;}
    public void setDiploma(String diploma) {this.diploma = diploma;}
    public void setCourses(String[] courses) {this.courses = courses;}

    public  void  printCluageStudent(double gpa,String diploma, String [] courses){

        System.out.println("GPS"+ getGpa());
        System.out.println("Diploma"+ getDiploma());
        System.out.println("Courses"+getCourses());
    }
}
