package AssigmentMay2024.HierarchicalInheritance;

import java.util.PropertyResourceBundle;

public class Bird extends Animal {
 private boolean canFly;

    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

    public boolean isCanFly() {return canFly;}
    public void setCanFly(boolean canFly) {this.canFly = canFly;}

    public void print(){
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(canFly);
    }
}
