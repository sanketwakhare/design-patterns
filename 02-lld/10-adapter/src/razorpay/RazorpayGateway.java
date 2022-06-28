package razorpay;

public class RazorpayGateway {
    public String payViaCreditCard(String ccNumber, String cvv, String expiry) {
        System.out.println("payment done via Razorpay");
        return "1";
    }

    public String checkPaymentStatus() {
        return "SUCCESS";
    }
}
