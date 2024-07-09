package AssigmentMay2024.petRecodsmanagment;

public class Dog extends Animal {

    public static void main(String[] args) {
        var dogObjec=new Dog("While",22,"yes");
        dogObjec.printDoginfo();
    }

    private String breed;

    public Dog(String species, int age, String breed) {
        super(species, age);
        this.breed = breed;
    }
    public String getBreed() {return breed;}
    public void setBreed(String breed) {this.breed = breed;}
    public void printDoginfo(){
        System.out.println("Species: "+getSpecies());
        System.out.println("age: "+getAge());
        System.out.println("Breeding: "+getBreed());

    }
}
