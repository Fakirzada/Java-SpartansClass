package week_11.MultilayerInheratances;

public class RunChild {

    public static void main(String[] args) {

        var object=new Child("Ali","Ahmad","Jan");
        object.printInfoAllCalss();
        object.updateChild("Khan");
        object.printInfoAllCalss();
        object.toString();

    }
}
