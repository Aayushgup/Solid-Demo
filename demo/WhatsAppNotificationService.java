package solid.demo;

public class WhatsAppNotificationService implements MessageServices {

    public void sendMessage(long amount) {
        System.out.println("WhatsAppNotification: Rs. "+amount+" has been debited from your account");
    }
}
