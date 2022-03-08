package solid.demo;

public class CreditCard extends BankCard {

    public void doTransaction(long amount){
        System.out.println("Payment of " +amount+" rupees Successfully Received using Credit card.");
        System.out.println("Thanks for shopping !!");
    }
}
