package VoilatedDemo;
/// It is violating open closed principle now.
public class NotificationServices {
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
    {     if (medium.equals("mobile"))
        System.out.println("MobileNotification: Transaction of "+amount+" has been done from your account");
        else if(medium.equals("mail"))
        System.out.println("EmailNotification: Transaction of "+amount+" has been done from your account");
    }
}
