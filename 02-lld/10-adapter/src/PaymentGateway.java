// Common interface at flipkart
public interface PaymentGateway {
    Long payViaCC(String ccNumber, int cvv, int expMonth, int expYear);
    PaymentStatus getStatus(Long id);
}
