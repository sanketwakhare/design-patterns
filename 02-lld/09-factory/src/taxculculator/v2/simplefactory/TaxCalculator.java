package taxculculator.v2.simplefactory;

/**
 * OCP is violated here as need to change this class when new regime need to be added
 */
public class TaxCalculator {

    public static Double calculateTax(TaxRegime regime, SalaryDetails salaryDetails) {
        return TaxCalculatorFactory
                    .getTaxCalculator(regime)
                    .calculateTax(salaryDetails);
    }
}
