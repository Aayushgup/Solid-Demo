package solid.demo;

public class MobileNotificationService implements OtpServices, MessageServices {
    public void sendOTP() {

        ////we can integrate here Api like twillio and other
        System.out.println("Otp sent to Mobile !");
    }
    public void sendMessage(long amount) {
        System.out.println("MobileNotification: Rs." +amount+" has been debited from your account");
    }
}
