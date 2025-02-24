public class Account {

    String account;
    int pin;
    float balance;

     public Account(String account, int pin, float balance) {
        this.account = account;
        this.pin = pin;
        this.balance = balance;

    }

    public boolean verfypin(int enteredpin){
        return this.pin == enteredpin;
    }

    public Account() {

    }
}
