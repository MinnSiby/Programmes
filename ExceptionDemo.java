import java.util.Scanner;

public class ExceptionDemo {

    public static void main(String[] args)
    {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter first number ");
        int num1 = scan1.nextInt();
        System.out.println("Enter Second number ");
        int num2 = scan1.nextInt();

        try{
                int result = num1 / num2;
                System.out.println("Answer is " +result);
           } catch (ArithmeticException e)
        {
            System.out.println("Division by 0 is not possible");
        }

    }
}
