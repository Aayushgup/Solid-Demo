package solid.demo;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {


    public static void main(String[] args) throws InterruptedException {
        System.out.print("Enter Amount to be Paid for Cart: ");
        Scanner sc = new Scanner(System.in);
        long amount=sc.nextInt();
        System.out.print("Choose Payment option: ");
        String CardOption=sc.next();

        if(CardOption.equals("Credit")) {
            BankCard bankCard = new CreditCard();
            POS NewCart = new POS(bankCard);
            //Sending(new MobileNotificationService());
            MobileNotificationService m1 = new MobileNotificationService();
            m1.sendOTP();
//            NewCart.otpRequest();
//            NewCart.messageRequest(amount);
            EmailNotificationService w1 = new EmailNotificationService();
            w1.sendOTP();
            TimeUnit.SECONDS.sleep(2);
            m1.sendMessage(amount);
            // Sending(new WhatsAppNotificationService());
            w1.sendMessage(amount);
            TimeUnit.SECONDS.sleep(2);
            NewCart.transaction(amount);
        }
        else
        {
            BankCard bankCard = new DebitCard();
            POS NewCart = new POS(bankCard);
            // Sending(new MobileNotificationService());
            MobileNotificationService m1 = new MobileNotificationService();
            m1.sendOTP();
            EmailNotificationService w1 = new EmailNotificationService();
            w1.sendOTP();
            TimeUnit.SECONDS.sleep(2);
            m1.sendMessage(amount);
            // Sending(new WhatsAppNotificationService());

            w1.sendMessage(amount);
            TimeUnit.SECONDS.sleep(2);
            NewCart.transaction(amount);
        }
    }
}
//    public static void Sending(MobileNotificationService MNS){
//        MNS.sendOTP();
//
//    }