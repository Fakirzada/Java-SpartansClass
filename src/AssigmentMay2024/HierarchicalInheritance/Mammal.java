package AssigmentMay2024.HierarchicalInheritance;

public class Mammal extends Animal {

    private boolean isDomestic;
    public Mammal(String name, int age, boolean isDomestic) {
        super(name, age);
        this.isDomestic = isDomestic;
    }
    public boolean isDomestic() {return isDomestic;}
    public void setDomestic(boolean domestic) {isDomestic = domestic;}


    public void print(){
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(isDomestic);
    }
}


