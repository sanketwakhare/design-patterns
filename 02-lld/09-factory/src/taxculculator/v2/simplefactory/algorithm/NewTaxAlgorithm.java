package taxculculator.v2.simplefactory.algorithm;


import taxculculator.v2.simplefactory.SalaryDetails;

public class NewTaxAlgorithm implements TaxAlgorithm {
    @Override
    public Double calculateTax(SalaryDetails salaryDetails) {
        return 0.45 * salaryDetails.getBasePay() + 0.35 * salaryDetails.getHra();
    }
}
