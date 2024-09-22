package InterfaceDemo;

public class SmartPhone implements Camera,Calculator,Internet{

    int screenSize ;

    public SmartPhone(int screenSize) {
        this.screenSize = screenSize;
    }

    public void takePicture()
    {
        System.out.println("Smartphone has camera feature");
    }
    public void takeVideo()
    {
        System.out.println("Smartphone has video feature");
    }

    public void addition()
    {
        System.out.println("Smartphone has calculator addition feature");
    }

    public void subtraction()
    {
        System.out.println("Smartphone has calculator subtraction feature");
    }

    public void browse()
    {
        System.out.println("Smartphone has browsing feature");
    }

    public void shoppingApps()
    {
        System.out.println("Smartphone can install shopping Apps");
    }
}
