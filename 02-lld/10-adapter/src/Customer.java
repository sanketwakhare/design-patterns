public class Customer {

    // even thought there are different implementation for each payment vendor,
    // adapters are helping us to call either APIs as need arises without changing the code
    public static void main(String[] args) {


        // payment with Razorpay payment gateway
        Flipkart flipkart = new Flipkart(new RazorpayPaymentGatewayAdapter());
        flipkart.makePaymentViaCC("423542352", 111, 6,2022);
        System.out.println("done");

        // payment with PayUMoney payment gateway
        flipkart = new Flipkart(new PayUMoneyPaymentGatewayAdapter());
        flipkart.makePaymentViaCC("423542352", 111, 6,2022);
        System.out.println("done");
    }
}
