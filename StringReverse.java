import java.util.Scanner;

public class StringReverse
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the string to be reversed");
        String name = scan.nextLine();
        reverse(name);

    }
        public static void reverse(String name)
        {
            String reversed = "";
            for (int i = name.length() - 1; i >= 0; i--) {
                reversed += name.charAt(i);
            }
            System.out.println("Reversed string is : ");
            System.out.println(reversed);
        }


}
