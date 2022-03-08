package solid.demo;

public abstract class BankCard extends MobileNotificationService implements CardPaymentServices  {

    public abstract void doTransaction(long amount);

    // other method can be there like check balance
    // card validity check.
    // statement method
}
