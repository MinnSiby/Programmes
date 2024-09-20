package Bankdemo;

import java.util.Scanner;

public class AccountDetails {

    private String accountHolder;
    private int balance;
    int withdrawAmount;


    public AccountDetails(String accountHolder, int balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("How much to be deposited");
        int depositAmount = scan.nextInt();
        balance = balance + depositAmount;
        System.out.println("your new balance is " +balance);
    }

    public void withdraw()
    {
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("How much to withdraw");
            withdrawAmount = scan.nextInt();
            if (balance < withdrawAmount) {
                System.out.println("Withdraw amount is greater than your current balance , Not possible ,Enter less amount");
            }
        }while (balance < withdrawAmount);

            System.out.println("Amount withdrawn is successful");
            balance = balance-withdrawAmount;
            System.out.println("your new balance is " +balance);
    }

}
