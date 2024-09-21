package AbstractDemo;

public abstract class Car extends Vehicle{

    public Car(int year, String model) {
        super(year, model);
    }

    public void wheels()
    {
        System.out.println("Car Wheels number is 4");
    }

    public void windows()
    {
        System.out.println("Car Windows number is 4");
    }

}
