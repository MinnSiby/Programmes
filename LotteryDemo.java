import java.util.Scanner;

public class LotteryDemo {


    public static void main(String[] args)
    {
        for(int i=0; i<=2; i++) {
            System.out.println("enter number from 1-100 and you have only 3 chances ");
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();

            if (num == 55) {
                System.out.println("you won the lucky number ");
                break;
            }
            else {
                if(2-i==0)
                {
                    System.out.println("your turn completed");
                }
                System.out.println("you have "  +(2-i)+ " more chance");
            }

        }
    }
}
