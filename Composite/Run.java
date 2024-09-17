package Composite;

public class Run {

    public static void main(String[] args)
    {
        Address ad1 = new Address("Kingston","Scarborough","Canada","M1E4W7");
        Employee emp1 = new Employee("Minnu","minnusiby5@gmail.com",647857597,ad1);
        emp1.display();
        System.out.println();
        Employee emp2 = new Employee("Siby","siby@gmail.com",459486748, new Address("Neilson","Waterloo","Canada","M8R7S0"));
        emp2.display();
    }
}
