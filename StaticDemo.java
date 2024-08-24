public class StaticDemo {

    String name;
    String email;
    int phNo ;
    static String University = "MG University";


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
    }

    public static void main(String[] args)
    {
        StaticDemo staticDemo1 = new StaticDemo("Minnu","minnu@gmail.com", 567890123);
        staticDemo1.display();
        System.out.println();
        StaticDemo staticDemo2 = new StaticDemo("Siby","siby@gmail.com", 456824368);
        staticDemo2.display();

    }
}
