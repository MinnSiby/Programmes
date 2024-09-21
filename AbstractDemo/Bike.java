package AbstractDemo;

public class Bike extends Vehicle{

    public Bike(int year, String model) {
        super(year, model);
    }

    public void wheels()
    {
        System.out.println("Bike Wheels number is 2");
    }
    public void windows()
    {
        System.out.println("Bike has No windows");
    }
    public  void seatingCapacity()
    {
        System.out.println("Bike Seating Capacity is 2");
    }
}
