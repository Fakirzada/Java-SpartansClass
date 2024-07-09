package AssigmentMay2024.HierarchicalInheritance;

public class Fish extends Animal {

    private  boolean isSaltWater;

    public Fish(String name, int age, boolean isSaltWater) {
        super(name, age);
        this.isSaltWater = isSaltWater;
    }

    public boolean isSaltWater() {return isSaltWater;}
    public void setSaltWater(boolean saltWater) {isSaltWater = saltWater;}
    public void print(){
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(isSaltWater);
    }
}
