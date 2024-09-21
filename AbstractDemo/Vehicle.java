package AbstractDemo;

public abstract class Vehicle {

    private int year;
    private String model;

    public Vehicle(int year, String model) {
        this.year = year;
        this.model = model;
    }


    public abstract void wheels();
    public abstract void windows();
    public abstract void seatingCapacity();

    public void liquid()
    {
        System.out.println("Vehicle uses petrol");
    }


}
