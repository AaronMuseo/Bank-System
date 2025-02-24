public class Deposit {


    float deposit;
    Account acc;

    public Deposit(Account acc, float deposit) {

        this.deposit = deposit;
        this.acc = acc;
    }

    void makedeposit() {

        acc.balance +=deposit;
        System.out.println("The balance after deposit is: $" + acc.balance);


    }

    public Deposit() {

    }

}
