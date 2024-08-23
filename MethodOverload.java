public class MethodOverload {

    public static void main(String[] args)
    {
        MethodOverload mo1 = new MethodOverload();
        System.out.println(mo1.details("minnu"));
        System.out.println(mo1.details("minnu","minnusiby5@gmail.com"));
        System.out.println(mo1.details("minnu","minnusiby5@gmail.com",1234567876));
    }

    public String details(String name)
    {
        return ("Hello " +  name);

    }

    public String details(String name,String email)
    {
        return ("Hello " +  name + " and your email is " +email);

    }

    public String details(String name,String email,int phNo)
    {
        return ("Hello " +  name + ",your email is " +email+ " and Ph:no is " +phNo);

    }
}
