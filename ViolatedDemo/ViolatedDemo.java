package VoilatedDemo;

//import
import java.util.Scanner;
//import java.util.concurrent.TimeUnit;

// Here it is violating Dependency Inversion principle
class DebitCard{

    public void doTransaction(long amount){
        System.out.println("payment done using Debit card of"+ amount + " rupees");
    }
}
class CreditCard{

    public void doTransaction(long amount){
        System.out.println("payment done using Credit card of "+ amount + " rupees");
    }
}
// class is totally dependent on specific Card
// Violating Dependency Inversion Principle
class POS {

    private final  CreditCard creditcard;

    public POS(CreditCard newCard) {
        this.creditcard = newCard;
    }

    public void doPurchaseSomething(long amount){
        creditcard.doTransaction(amount);
    }

    // violating SRP
    public void sendOTP(String medium)
    {
        if(medium.equals("mail")) {
            // we can email related api here
            //like javamailSender api
        }
        else if (medium.equals("mobile")) {
            // write mobile related api
            //and other api too
            System.out.println("Otp received for payment ");
        }


    }
    public void sendMessage(long amount,String medium)
    {
        if (medium.equals("mobile"))
        System.out.println("MobileNotification: Transaction of "+amount+" has been done from your account");

        else if(medium.equals("mail"))
        System.out.println("EmailNotification: Transaction of "+amount+" has been done from your account");
    }

    public void getStatement()
    {
        // we can get a summary of recent transactions.
    }
    public void isValid()
    {
        //to check whether the card is valid or not.
    }

}

//////////////////


public class ViolatedDemo {

    public static void main(String[] args) {
        System.out.print("Enter Amount:");
        Scanner sc = new Scanner(System.in);
        long amount=sc.nextInt();

        CreditCard newCard = new CreditCard();
        POS vmart = new POS(newCard);

        NotificationServices w1= new NotificationServices();
        w1.sendOTP("mobile");
        w1.sendMessage(amount,"mobile");

//        MobileNotificationService m1= new MobileNotificationService();
//        m1.sendOTP();
//        m1.sendMessage(amount);
//
//        EmailNotificationService e1= new EmailNotificationService();
//        e1.sendMessage(amount);

        vmart.doPurchaseSomething(amount);

    }
}

