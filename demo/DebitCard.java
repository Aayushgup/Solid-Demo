package solid.demo;

public class DebitCard extends BankCard {
    public void doTransaction(long amount){
        System.out.println("Payment of "+ amount+" rupees Successfully Received using Debit card.");
        System.out.println("Thanks for shopping !!");
    }
}
