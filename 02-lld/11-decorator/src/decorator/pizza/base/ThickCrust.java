package decorator.pizza.base;

import decorator.pizza.IBase;

public class ThickCrust implements IBase {
    @Override
    public double getCost() {
        return 150;
    }

    @Override
    public String getIngredients() {
        return "ThickCrust";
    }
}
