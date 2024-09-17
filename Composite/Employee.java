package Composite;

public class Employee {
    String name;
    String email;
    int phNumber;
    Address address;

    public Employee(String name, String email, int phNumber, Address address) {
        this.name = name;
        this.email = email;
        this.phNumber = phNumber;
        this.address = address;
    }

    public void display()
    {
        System.out.println(name);
        System.out.println(email);
        System.out.println(phNumber);
        System.out.println("Address: ");
        System.out.println(address.street);
        System.out.println(address.city);
        System.out.println(address.country);
        System.out.println(address.postalCode);

    }


}
