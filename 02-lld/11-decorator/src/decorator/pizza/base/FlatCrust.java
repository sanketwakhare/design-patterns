package decorator.pizza.base;

import decorator.pizza.IBase;

public class FlatCrust implements IBase {

    @Override
    public double getCost() {
        return 100;
    }

    @Override
    public String getIngredients() {
        return "FlatCrust";
    }
}
