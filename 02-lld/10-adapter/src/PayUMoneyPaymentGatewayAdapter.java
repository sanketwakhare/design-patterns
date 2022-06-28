import payumoney.PayUMoneyGateway;
import payumoney.PayUMoneyPaymentStatus;

public class PayUMoneyPaymentGatewayAdapter implements PaymentGateway {

    PayUMoneyGateway payUMoneyGateway = new PayUMoneyGateway();

    @Override
    public Long payViaCC(String ccNumber, int cvv, int expMonth, int expYear) {

        return payUMoneyGateway.makeCreditCardPayment(ccNumber,
                String.valueOf(cvv),
                String.valueOf(expMonth),
                String.valueOf(expYear));
    }

    @Override
    public PaymentStatus getStatus(Long id) {
        PayUMoneyPaymentStatus status = payUMoneyGateway.getPaymentStatus(String.valueOf(id));
        if(status.equals(PayUMoneyPaymentStatus.FAILURE))
            return PaymentStatus.FAILURE;
        if(status.equals(PayUMoneyPaymentStatus.TIMEOUT))
            return PaymentStatus.FAILURE;
        if(status.equals(PayUMoneyPaymentStatus.CANCELLED))
            return PaymentStatus.FAILURE;
        if(status.equals(PayUMoneyPaymentStatus.PENDING))
            return PaymentStatus.PENDING;
        return PaymentStatus.SUCCESS;
    }
}
