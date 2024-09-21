package AbstractDemo;

public class RunMain {

    public static void main(String[] args)
    {
     Bike bk = new Bike(2023,"Honda");
     bk.seatingCapacity();
     bk.wheels();
     bk.windows();
     bk.liquid();
     Innova ino = new Innova(2024,"QURTY");
     ino.seatingCapacity();
     Car cr = new Innova(2020,"HTUHTJ");
     cr.wheels();
     cr.windows();
    }
}
