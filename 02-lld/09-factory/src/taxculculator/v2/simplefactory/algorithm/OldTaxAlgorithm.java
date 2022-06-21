package taxculculator.v2.simplefactory.algorithm;

import taxculculator.v2.simplefactory.SalaryDetails;

public class OldTaxAlgorithm implements TaxAlgorithm {
    @Override
    public Double calculateTax(SalaryDetails salaryDetails) {
        return 0.4 * salaryDetails.getBasePay() + 0.3 * salaryDetails.getHra();
    }
}
