package taxculculator.v1.base;

/**
 * OCP is violated here as need to change this class when new regime need to be added
 */
public class TaxCalculator {

    public static Double calculateTax(TaxRegime regime, SalaryDetails salaryDetails) {
        switch (regime) {
            case OLD:
                return 0.4 * salaryDetails.getBasePay() + 0.3 * salaryDetails.getHra();
            case NEW:
                return 0.45 * salaryDetails.getBasePay() + 0.35 * salaryDetails.getHra();
        }
        throw new RuntimeException("invalid regime");
    }
}
