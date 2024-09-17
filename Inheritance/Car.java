package Inheritance;

public class Car extends Vehicle{

    int fuelCapacity = 70;

    public void display()
    {
        System.out.println("Vehicle calling");
        super.displayVehicle();
        System.out.println("Fuel Capcity of car is " +fuelCapacity);
        System.out.println("Fuel Capcity of vehicle is " +super.fuelCapacity);
    }
}
