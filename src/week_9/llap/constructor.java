package week_9.llap;

public class constructor {
        String model;
        int year;
        // سازنده بدون پارامتر
    public constructor() {
            model = "Unknown";
            year = 0;
        }
        public void displayInfo() {
            System.out.println("Model: " + model + ", Year: " + year);
        }

        public static void main(String[] args) {
            constructor myCar = new constructor(); // سازنده بدون پارامتر فراخوانی می‌شود
            myCar.displayInfo();
        }

}
