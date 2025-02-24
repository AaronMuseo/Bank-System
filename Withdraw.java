import java.util.Scanner;

public class Withdraw {

    Scanner scan = new Scanner(System.in);
    float withdrawAmount;
    Account acc;
    public Withdraw(Account acc, float withdrawAmount) {

        this.withdrawAmount = withdrawAmount;
        this.acc = acc;

    }


    public void with(){

        if(withdrawAmount <= 0){

            System.out.println("Invalid amount");



            }if (acc.balance >= withdrawAmount){
                acc.balance -= withdrawAmount;
                System.out.println("Withdraw Successful! New balance is: $" + acc.balance);

            }else{
                System.out.println("Insufficient Balance. Available balance is now: $" + acc.balance);
            }

        }
    }



