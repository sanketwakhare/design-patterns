public class Flipkart {

    private final PaymentGateway paymentGateway;

    Flipkart(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void makePaymentViaCC(String ccNumber, int cvv, int expMonth, int expYear) {
        Long transactionId =  paymentGateway.payViaCC(ccNumber, cvv, expMonth, expYear);

        while(!paymentGateway.getStatus(transactionId).equals(PaymentStatus.SUCCESS)) {
            System.out.println("waiting");
        }
    }
}
