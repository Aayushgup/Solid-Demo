package VoilatedDemo;
// violating ISP
public class Paytm extends UPIPaymentServices{
    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchcard() {

    }

    @Override
    public void getCBAsBalance() {
   // feature not available

    }
}
