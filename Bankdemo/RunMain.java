package Bankdemo;

public class RunMain {

    public static void main(String[] args)
    {
        AccountDetails ad = new AccountDetails("Minnu", 2000);
        ad.deposit();
        ad.withdraw();
        System.out.println("Account Holder name :");
        System.out.println(ad.getAccountHolder());
        System.out.println("Balance after all transactions is: ");
        System.out.println(ad.getBalance());
    }
}
