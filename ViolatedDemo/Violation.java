package VoilatedDemo;

public class Violation {
    //here it is violating interface segregation principle
    interface Notification {

        void sendOTP();

        void sendMessage(long amount);



    }
    public static void main(String[] args) {
        Notification n=new WhatsAppNotificationService();
        n.sendOTP();
    }


    class MobileNotificationService implements Notification {

        public void sendOTP() {
            System.out.println("sent otp to Mobile");
        }

        public void sendMessage(long amount) {

            System.out.println("MobileNotification: Transaction of " + " has been done from your account");
        }
    }

    ////
    class EmailNotificationService implements Notification {

        public void sendOTP() {
            System.out.println("sent otp to Mobile");
        }

        public void sendMessage(long amount) {
            System.out.println("EmailNotification: Transaction of " + amount + " has been done from your account");
        }
    }

    ////violated liskov substitution Principle
    static class WhatsAppNotificationService implements Notification {

        @Override
        public void sendOTP() {
            // Feature NOT applicable for now.
            throw new RuntimeException("Not Supported");
        }

        @Override
        public void sendMessage(long amount) {
            System.out.println("WhatsAppNotification: Transaction of " + amount + " has been done from your account");
        }

//}
    }
}

