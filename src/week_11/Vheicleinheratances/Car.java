package week_11.Vheicleinheratances;

public class Car extends Vehicles {

    String door;
    String color;

    public Car(String companyname, String door, String color) {
        super(companyname);
        this.door = door;
        this.color = color;
    }



    public void stop(){

        System.out.println("All Vehicle Stop");
    }


}
