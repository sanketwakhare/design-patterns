package taxculculator.v2.simplefactory;

/**
 * Simple Factory implementation
 */
public class Main {

    public static void main(String[] args) {

        SalaryDetails salaryDetails = new SalaryDetails();
        salaryDetails.setBasePay(Double.valueOf(1000));
        salaryDetails.setHra(Double.valueOf(500));
        salaryDetails.setLpa(Double.valueOf(200));

        System.out.println(TaxCalculator.calculateTax(TaxRegime.OLD, salaryDetails));
        System.out.println(TaxCalculator.calculateTax(TaxRegime.NEW, salaryDetails));
    }
}
