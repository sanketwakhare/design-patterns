package payumoney;

public class PayUMoneyGateway {

    public Long makeCreditCardPayment(String ccNumber, String cvv, String expiryMonth, String expiryYear) {
        System.out.println("payment done via PayUMoney");
        return 4234234L;
    }

    public PayUMoneyPaymentStatus getPaymentStatus(String trxId) {
        return PayUMoneyPaymentStatus.SUCCESS;
    }
}
