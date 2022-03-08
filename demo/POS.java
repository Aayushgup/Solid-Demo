package solid.demo;

public class POS {

    private  BankCard bankCard;

    public POS(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void transaction(long amount)
    {
        bankCard.doTransaction(amount);
    }
    public void otpRequest()
    {
        bankCard.sendOTP();
    }
    public void messageRequest(long amount)
    {
        bankCard.sendMessage(amount);
    }

}