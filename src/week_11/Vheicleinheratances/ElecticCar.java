package week_11.Vheicleinheratances;

public class ElecticCar extends Car {

    public ElecticCar(String companyname, String door, String color) {
        super(companyname, door, color);
    }

    public void batterychagering(){

        System.out.println("All ELECTRIC ACAR CHNAGE BATTERY");
    }
    public void print(){

        for(int i=0;i<20;i++){
            System.out.print("*");
        }
        System.out.println();
        System.out.println("Toyota: "+companyname);
        System.out.println("Car Doors: "+door);
        System.out.println("Color: "+color);
    }

}
