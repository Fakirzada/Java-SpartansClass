package AssigmentMay2024.OnlineCourse;
public class OnlineCourse extends Course {
    private String platForm;

    public static void main(String[] args) {
        var objectonlineCourse=new OnlineCourse("IT","2040","ZOOM");
        objectonlineCourse.printonlineCourseInfo();
    }
    //constructor
    public OnlineCourse(String coursename, String courseCode, String platForm)
    { super(coursename,courseCode);
        this.platForm=platForm;}
    //getter

    public String getPlatForm(){return platForm;}
    private void setPlatForm(String platForm){this.platForm=platForm;}

    public void printonlineCourseInfo(){
        System.out.println("Course Name: "+getCoursename());
        System.out.println("Course Code: "+getCourseCode());
        System.out.println("Course PlatForm: "+getPlatForm());
    }
}
