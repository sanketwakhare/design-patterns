package taxculculator.v2.simplefactory.algorithm;


import taxculculator.v2.simplefactory.SalaryDetails;

public interface TaxAlgorithm {
    Double calculateTax(SalaryDetails salaryDetails);
}
