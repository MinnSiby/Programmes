public class ConstructorTypes {



        String carModel;
        String carColor;
        String CarType;
        int year;

    ConstructorTypes()
    {
        System.out.println("Default Constructor");
    }

    ConstructorTypes(String carModel)
    {
        this.carModel = carModel;
    }

    ConstructorTypes(String carModel ,String carColor)
    {
        this.carModel = carModel;
        this.carColor = carColor;
        System.out.println("CarModel is " +carModel+ " and car color is " +carColor);
    }

    ConstructorTypes(String carModel ,String carColor, String CarType)
    {
        this.carModel = carModel;
        this.carColor = carColor;
        this.CarType = CarType;
        System.out.println("CarModel is " +carModel+ " , car color is " +carColor+ " and car type is " +CarType);
    }

    ConstructorTypes(String carModel ,String carColor, String CarType, int year)
    {
        this.carModel = carModel;
        this.carColor = carColor;
        this.CarType = CarType;
        this.year = year;
        System.out.println("CarModel is " +carModel+ " , car color is " +carColor+ " , car type is " +CarType+ " and year is " +year);
    }


    public static void main(String[] args) {

        ConstructorTypes consType1 = new ConstructorTypes();
        ConstructorTypes consType2 = new ConstructorTypes("Innova");
        ConstructorTypes consType3 = new ConstructorTypes("Innova","grey");
        ConstructorTypes consType4 = new ConstructorTypes("Innova","grey","2G");
        ConstructorTypes consType5 = new ConstructorTypes("Innova","grey","2G",2023);
    }
}
