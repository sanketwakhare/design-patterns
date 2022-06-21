package taxculculator.v2.simplefactory;

import taxculculator.v2.simplefactory.algorithm.NewTaxAlgorithm;
import taxculculator.v2.simplefactory.algorithm.OldTaxAlgorithm;
import taxculculator.v2.simplefactory.algorithm.TaxAlgorithm;

public class TaxCalculatorFactory {

    public static TaxAlgorithm getTaxCalculator(TaxRegime regime) {
        switch (regime) {
            case OLD:
                return new OldTaxAlgorithm();
            case NEW:
                return new NewTaxAlgorithm();
        }
        throw new RuntimeException("invalid regime " + regime);
    }
}
