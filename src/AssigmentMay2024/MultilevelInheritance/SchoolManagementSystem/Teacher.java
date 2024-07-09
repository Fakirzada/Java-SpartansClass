package AssigmentMay2024.MultilevelInheritance.SchoolManagementSystem;

public class Teacher extends Person {

    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        setSubject(subject);
    }

    public String getSubject() {return subject;}
    public void setSubject(String subject) {this.subject = subject;}


    public  void printinfo(){
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getSubject());
    }
}
