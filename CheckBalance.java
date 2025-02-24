public class CheckBalance {
    Account acc;

    public CheckBalance(Account acc){

        this.acc = acc;

    }

    public void check(){

        System.out.println("Current balance for " + acc.account + " is: $ " + acc.balance);

    }

}
