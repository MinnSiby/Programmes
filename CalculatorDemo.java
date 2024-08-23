import java.util.Scanner;

public class CalculatorDemo {

        public static void main(String[] args) {

            char choice = 0;
            do {
                System.out.println("******************************");
                System.out.println("Welcome to My Calculator...");
                System.out.println("******************************");

                System.out.println("1. Addition");
                System.out.println("2. Multiplication");
                System.out.println("3. Subtraction");
                System.out.println("4. Division");

                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter your input ");
                int input = scanner.nextInt();

                switch (input) {
                    case 1:
                        System.out.println("Enter first number ");
                        int firstSumNum = scanner.nextInt();
                        System.out.println("Enter second number ");
                        int SecondSumNum = scanner.nextInt();
                        int sum = firstSumNum + SecondSumNum;
                        System.out.println("Sum is  " +sum);
                        break;

                    case 2:
                        System.out.println("Enter first number ");
                        int firstMulNum = scanner.nextInt();
                        System.out.println("Enter second number ");
                        int SecondMulNum = scanner.nextInt();
                        int product = firstMulNum * SecondMulNum;
                        System.out.println("Product is  " + product);
                        break;

                    case 3:
                        System.out.println("Enter first number ");
                        int firstSubNum = scanner.nextInt();
                        System.out.println("Enter second number ");
                        int SecondSubNum = scanner.nextInt();
                        int answer = firstSubNum - SecondSubNum;
                        System.out.println("Answer is  " + answer);
                        break;

                    case 4:
                        System.out.println("Enter first number ");
                        int firstDivNum = scanner.nextInt();
                        System.out.println("Enter second number ");
                        int SecondDivNum = scanner.nextInt();
                        int quotient = firstDivNum / SecondDivNum;
                        System.out.println("Quotient is  " + quotient);
                        break;

                    default:
                        System.out.println("Wrong input ");


                }

                System.out.println("Do you still want to continue ?? Y for yes , N no");

                choice = scanner.next().charAt(0);
                System.out.println(choice);
            }while (choice != 'N' &&  choice != 'n' );
        }



    }






