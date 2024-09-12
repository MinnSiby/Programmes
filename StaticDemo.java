public class StaticDemo {

    String name;
    String email;
    int phNo ;
    String University = "MG University";
    static int id = 1;


    StaticDemo(String name , String email, int phNo)
    {
        this.name = name;
        this.email = email;
        this.phNo = phNo;
    }

    public void display()
    {
        System.out.println("Name is " +name);
        System.out.println("Email is " +email);
        System.out.println("Phone number is " +phNo);
        System.out.println("University is " +University);
        System.out.println("ID is " +id++);
    }

    public static void main(String[] args)
    {
        StaticDemo staticDemo1 = new StaticDemo("Minnu","minnu@gmail.com", 567890123);
        staticDemo1.display();
        System.out.println();
        StaticDemo staticDemo2 = new StaticDemo("Siby","siby@gmail.com", 456824308);
        staticDemo2.display();
        System.out.println();
        StaticDemo staticDemo3 = new StaticDemo("Minsi","minsi@gmail.com", 256824858);
        staticDemo3.display();

    }
}
