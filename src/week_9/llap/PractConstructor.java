package week_9.llap;

public class PractConstructor {
    String name;
    String lastName;
    int id;
    // this construtor
    private PractConstructor(){
        id=100;
        name="Ali";
        lastName="khan";
    }
    //construtore without parameters
    private void  displayEmplyInfo(){
        System.out.print("ID: "+id+"Name: "+name+"LastName: "+lastName);
    }
    public static void main(String[] args) {
        PractConstructor myobj=new PractConstructor();
        myobj.displayEmplyInfo();
    }
}
