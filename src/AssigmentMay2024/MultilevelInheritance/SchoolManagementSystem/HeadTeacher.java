package AssigmentMay2024.MultilevelInheritance.SchoolManagementSystem;

public class HeadTeacher extends Teacher {
    public int yearsOfExperience;


    public HeadTeacher(String name, int age, String subject, int yearsOfExperience) {
        super(name, age, subject);
        setYearsOfExperience(yearsOfExperience);

    }
    public int getYearsOfExperience() {return yearsOfExperience;}
    public void setYearsOfExperience(int yearsOfExperience) {this.yearsOfExperience = yearsOfExperience;}


    @Override
    public String getSubject() {
        return super.getSubject();

    }

    public  void printinfo(){
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getYearsOfExperience());
        System.out.println(getSubject());
    }
}
