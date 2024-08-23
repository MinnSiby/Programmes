import java.util.Scanner;

public class RogersTech {


    public static void main(String[] args) {
        char choice = 0;
        int lang;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Select Language");
            System.out.println(" press 1 for English");
            System.out.println(" press 2 for French");
            lang = scan.nextInt();

            if(lang > 2)
            {
                System.out.println("Invalid language selection. Please select either 1 for English or 2 for French.");
            }
        }while(lang>2);



            do{
                if (lang == 1) {
                    System.out.println(" press 1 for Internet");
                    System.out.println(" press 2 for billing");
                    System.out.println(" press 3 for mobile");
                    System.out.println(" press 4 for techsupport");
                    int englishOpt = scan.nextInt();
                    switch (englishOpt) {
                        case 1:
                            System.out.println(" Connected to internet support");
                            break;

                        case 2:
                            System.out.println(" select billing option ");
                            System.out.println(" select 1 for current bill option ");
                            System.out.println(" select 2 for last bill ");
                            System.out.println(" select 3 for talk to agent option ");
                            int billOpt = scan.nextInt();
                            if (billOpt == 1) {
                                System.out.println(" Current bill selected ");
                            } else if (billOpt == 2) {
                                System.out.println(" last bill selected ");
                            } else {
                                System.out.println(" talk to agent selected ");
                            }
                            break;

                        case 3:
                            System.out.println(" mobile selected ");
                            break;

                        case 4:
                            System.out.println(" tech support selected ");
                            break;

                        case 5:
                            System.out.println(" agent talk selected ");
                            break;

                        default:
                            System.out.println(" Invalid option ");

                    }
                } else if (lang == 2) {

                    System.out.println(" French selected ");

                }

                System.out.println(" do you want to continue y/n");
                choice = scan.next().charAt(0);
                System.out.println(choice);
            } while (choice != 'N' && choice != 'n' );



    }
}
