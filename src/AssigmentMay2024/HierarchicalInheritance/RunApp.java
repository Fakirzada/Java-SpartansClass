package AssigmentMay2024.HierarchicalInheritance;

public class RunApp {

    public static void main(String[] args) {
        var objctmammal=new Mammal("Mammal",12,true);
        var objectBird=new Bird("bird",3,true);
        var object=new Fish("Samon",44,true);
        System.out.println("********* Mammal ***********");
        objctmammal.print();
        System.out.println("********** Bird **********");
        objectBird.print();
        System.out.println("********** Fish **********");
        object.print();

    }
}
