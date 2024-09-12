import java.util.Scanner;

public class ArrayDemo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your array size");
        int size = scan.nextInt();


        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter your " + (i+1) + " number");
            array[i] = scan.nextInt();
        }

        System.out.println("Your array is " );
        for (int element : array)
        {
            System.out.println( element);
        }
    }
}
