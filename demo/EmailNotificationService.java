package solid.demo;

public class EmailNotificationService extends MobileNotificationService {
    public void sendOTP() {
        // write different types of whatsapp api
        System.out.println("Otp sent to Email !");
    }
    public void sendMessage(long amount) {
        System.out.println("EmailNotification: Transaction of "+amount+" has been done from your account");
    }

}
