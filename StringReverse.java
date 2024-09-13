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
            StringBuilder reversed = new StringBuilder();
            for (int i = name.length() - 1; i >= 0; i--)
            {
                reversed.append(name.charAt(i));
            }
            System.out.println("Reversed string is : ");
            String result = reversed.toString();
            System.out.println(result);
        }


}
