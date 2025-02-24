import java.util.Scanner;

public class Main {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        Account Acc = new Account();
        Withdraw With;
        Deposit Dep;


        String name;
        int enteredpin;
        int option;
        int balance;
        float withdrawAmount;


        Account[] accounts = {
                new Account("Aaron", 1234, 500),
                new Account("Erika", 1738, 6500),
                new Account("Eugene", 5000, 1000),
                new Account("Shasa", 1212, 10)

        };


        System.out.println("Welcome");
        System.out.println("Please enter Account Name: ");
        name = scan.nextLine();

        Account currentAcc = null;

        for (Account acc : accounts) {
            if (acc.account.equals(name)) {
                currentAcc = acc;

                break;
            }
        }
        if (currentAcc == null) {
            System.out.println("Account Not Found");
            return;
        }


        System.out.println("Welcome " + name + " Please enter PIN ");
        enteredpin = scan.nextInt();
        if (currentAcc.pin != enteredpin) {
            System.out.println("Incorrect PIN");
            return;
        }
            while (true) {
                System.out.println("Login Successful");
                System.out.println("choose an option");
                System.out.println("1: Deposit");
                System.out.println("2: Withdraw");
                System.out.println("3: Check Balance");
                System.out.println("4: Exit");


                switch (option = scan.nextInt()) {
                    case 1: //deposit
                        float depositAmount;
                        System.out.println("Enter Amount to Deposit: ");

                        depositAmount = scan.nextFloat();

                        Dep = new Deposit(currentAcc, depositAmount);

                        Dep.makedeposit();

                        break;

                    case 2:

                        System.out.println("Enter Amount to Withdraw: ");
                        withdrawAmount = scan.nextFloat();
                        Withdraw with = new Withdraw(currentAcc, withdrawAmount);
                        with.with();

                        break;

                    case 3:

                        CheckBalance Check = new CheckBalance(currentAcc);

                        Check.check();

                        break;
                    case 4:
                        System.out.println("Exiting Application");
                        System.out.println("---Thank you for banking with us---");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Incorrect Option. Try again");

                }


            }
        }
}

