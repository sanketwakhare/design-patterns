import razorpay.RazorpayGateway;

public class RazorpayPaymentGatewayAdapter implements PaymentGateway{

    RazorpayGateway razorpayGateway = new RazorpayGateway();

    @Override
    public Long payViaCC(String ccNumber, int cvv, int expMonth, int expYear) {

        String result = razorpayGateway.payViaCreditCard(ccNumber,
                String.valueOf(cvv),
                String.valueOf(expMonth) +"/" +String.valueOf(expYear));

        return Long.parseLong(result);
    }

    @Override
    public PaymentStatus getStatus(Long id) {

        String result = razorpayGateway.checkPaymentStatus();
        if(result.equals("SUCCESS")) {
            return PaymentStatus.SUCCESS;
        }
        return PaymentStatus.FAILURE;
    }
}
