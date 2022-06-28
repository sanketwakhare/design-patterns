package decorator.pizza.base;

import decorator.pizza.IBase;

public class ThinCrust implements IBase {
    @Override
    public double getCost() {
        return 120;
    }

    @Override
    public String getIngredients() {
        return "ThinCrust";
    }
}
