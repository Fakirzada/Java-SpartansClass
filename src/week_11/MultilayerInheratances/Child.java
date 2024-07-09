package week_11.MultilayerInheratances;
public class Child extends  Father{
    String childname;
    public Child(String gandfathername, String fatherName, String childname) {
        super(gandfathername, fatherName);
        this.childname = childname;
    }
    public String getChildname() {return childname;}
    public void setChildname(String childname) {this.childname = childname;}
    public void printInfoAllCalss(){
        System.out.println(getGandfathername());
        System.out.println(getFatherName());
        System.out.println(getChildname());
    }
    public void updateChild(String childname){
        setChildname(childname);
    }


}



