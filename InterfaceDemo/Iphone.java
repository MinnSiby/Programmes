package InterfaceDemo;

public class Iphone extends SmartPhone{


    public Iphone(int screenSize) {
        super(screenSize);
    }

    public void takePicture()
    {
        System.out.println("Iphone camera taking pictures ");
    }

    @Override
    public void shoppingApps()
    {
        System.out.println("Iphone has Shopping Apps installed ");
    }

}
