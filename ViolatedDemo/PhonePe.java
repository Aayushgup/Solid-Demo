package VoilatedDemo;
//violating ISP
public class PhonePe extends UPIPaymentServices{

    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchcard() {

    }

    @Override
    public void getCBAsBalance() {
   /// this feature cannot be added in Phonepe.
    }
}
