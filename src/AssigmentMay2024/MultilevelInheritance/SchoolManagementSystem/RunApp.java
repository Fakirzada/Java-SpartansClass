package AssigmentMay2024.MultilevelInheritance.SchoolManagementSystem;

public class RunApp {

    public static void main(String[] args) {
        var objectHeadtecher=new HeadTeacher("Ali",23,"Math with Phisict",10);
        objectHeadtecher.printinfo();

        var objecTeacehr=new Teacher("khal",33,"IT");

        System.out.println("******** ********");
       objecTeacehr.printinfo();

    }
}
