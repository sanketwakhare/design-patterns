package taxculculator.v1.base;

public class Main {

    public static void main(String[] args) {

        SalaryDetails salaryDetails = new SalaryDetails();
        salaryDetails.setBasePay(1000.0);
        salaryDetails.setHra(500.0);
        salaryDetails.setLpa(200.0);

        System.out.println(TaxCalculator.calculateTax(TaxRegime.OLD, salaryDetails));
        System.out.println(TaxCalculator.calculateTax(TaxRegime.NEW, salaryDetails));
    }
}
